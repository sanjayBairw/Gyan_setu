package com.indiaquiz.app.data.repository

import com.indiaquiz.app.data.local.QuestionDao
import com.indiaquiz.app.data.model.AttemptQuestionRecord
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizConfig
import kotlinx.coroutines.flow.Flow
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

class QuestionRepository(private val questionDao: QuestionDao) {

    val allBookmarkedQuestions: Flow<List<Question>> = questionDao.getBookmarkedQuestionsFlow()

    suspend fun getQuestionsForQuiz(config: QuizConfig): List<Question> {
        ensureDatabasePopulated()
        val all = questionDao.getAllQuestions()

        if (config.mode == "QUICK_MIXED") {
            return getMixedRandomQuestions(config.questionCount, config.difficulty)
        }
        if (config.mode == "DAILY") {
            return getDailyQuestions(config.questionCount)
        }
        if (config.mode == "BOOKMARKS") {
            val bookmarks = questionDao.getBookmarkedQuestionsSync()
            return if (bookmarks.isNotEmpty()) bookmarks.shuffled().take(config.questionCount) else emptyList()
        }
        if (config.mode == "INCORRECT_RETRY") {
            val retryList = questionDao.getIncorrectQuestions()
            return if (retryList.isNotEmpty()) retryList.shuffled().take(config.questionCount) else emptyList()
        }
        if (!config.specificQuestionIds.isNullOrEmpty()) {
            return questionDao.getQuestionsByIds(config.specificQuestionIds)
        }

        val hasSpecificSubject = !config.subject.isNullOrEmpty() &&
                !config.subject.equals("ALL", ignoreCase = true) &&
                !config.subject.equals("All Subjects", ignoreCase = true) &&
                !config.subject.equals("सभी विषय", ignoreCase = true)

        val hasSpecificClass = !config.targetClass.isNullOrEmpty() &&
                !config.targetClass.equals("ALL", ignoreCase = true) &&
                !config.targetClass.equals("All Classes", ignoreCase = true) &&
                !config.targetClass.equals("सभी कक्षाएं", ignoreCase = true)

        val hasSpecificExam = !config.examOrBoard.isNullOrEmpty()

        val hasSpecificCategory = !config.category.isNullOrEmpty() &&
                config.category != "QUICK_MIXED" && config.category != "DAILY"

        val hasSpecificSubcategory = !config.subcategory.isNullOrEmpty()

        val collected = mutableListOf<Question>()
        val seenIds = mutableSetOf<String>()

        fun addFrom(source: List<Question>) {
            for (q in source.shuffled()) {
                if (collected.size >= config.questionCount) break

                // STRICT ISOLATION 1: Category boundary check
                // Never allow a question from a different category when a specific category is requested
                if (hasSpecificCategory && !q.category.equals(config.category, ignoreCase = true)) {
                    continue
                }

                // STRICT ISOLATION 2: Subject compatibility check
                // If a specific subject is requested, strictly guarantee subject compatibility!
                if (hasSpecificSubject && !isSubjectCompatible(q.subject, q.chapterOrTopic, q.tags, config.subject)) {
                    continue
                }

                if (seenIds.add(q.id)) {
                    collected.add(q)
                }
            }
        }

        // TIER 1: Exact filtered match (Category, Subcategory/Exam, Class, Subject, Difficulty)
        val tier1 = getFilteredQuestions(config)
        addFrom(tier1)

        // TIER 2: Relax difficulty if requested, but KEEP exact Category, Subcategory/Exam, Class, Subject
        if (collected.size < config.questionCount && !config.difficulty.isNullOrEmpty() && !config.difficulty.equals("ALL", ignoreCase = true)) {
            val configAnyDiff = config.copy(difficulty = "ALL")
            addFrom(getFilteredQuestions(configAnyDiff))
        }

        // TIER 3: Relax Board/Exam within the SAME Class and SAME Subject
        // (e.g. CBSE Class 10 Physics pools RBSE/BSEB/NCERT Class 10 Physics in SCHOOL_EDUCATION)
        if (collected.size < config.questionCount && hasSpecificClass && config.category == "SCHOOL_EDUCATION") {
            val sameClassSameSubj = all.filter { q ->
                q.category == "SCHOOL_EDUCATION" &&
                (q.targetClass != null && q.targetClass.equals(config.targetClass, ignoreCase = true)) &&
                isSubjectCompatible(q.subject, q.chapterOrTopic, q.tags, config.subject)
            }
            addFrom(sameClassSameSubj)
        }

        // TIER 4: Same Subject across all grades within same category (e.g. High School Physics)
        if (collected.size < config.questionCount && hasSpecificSubject && hasSpecificCategory) {
            val sameSubjSameCat = all.filter { q ->
                q.category.equals(config.category, ignoreCase = true) &&
                isSubjectCompatible(q.subject, q.chapterOrTopic, q.tags, config.subject)
            }
            addFrom(sameSubjSameCat)
        }

        // TIER 5: Subcategory pool (pool remaining questions from the same subcategory)
        if (collected.size < config.questionCount && hasSpecificSubcategory) {
            val subcatPool = all.filter { q ->
                q.subcategory.equals(config.subcategory, ignoreCase = true)
            }
            addFrom(subcatPool)
        }

        // TIER 6: Category pool (pool remaining questions from the same category)
        if (collected.size < config.questionCount && hasSpecificCategory) {
            val catPool = all.filter { q ->
                q.category.equals(config.category, ignoreCase = true) &&
                (!hasSpecificClass || (q.targetClass != null && q.targetClass.equals(config.targetClass, ignoreCase = true)))
            }
            addFrom(catPool)
        }

        // PADDING (if still less than questionCount and collected is not empty):
        // Pad by duplicating from the collected set with unique IDs so that user ALWAYS gets their selected question count
        // and every question is 100% strictly on-topic!
        if (collected.isNotEmpty() && collected.size < config.questionCount) {
            val original = collected.toList()
            var padIndex = 1
            while (collected.size < config.questionCount) {
                for (q in original.shuffled()) {
                    if (collected.size >= config.questionCount) break
                    collected.add(q.copy(id = "${q.id}_repeat_${padIndex++}"))
                }
            }
        }

        return collected.take(config.questionCount)
    }

    private fun isSubjectCompatible(questionSubject: String?, questionTopic: String?, questionTags: List<String>?, requestedSubject: String?): Boolean {
        if (requestedSubject.isNullOrEmpty() || 
            requestedSubject.equals("ALL", ignoreCase = true) || 
            requestedSubject.equals("All Subjects", ignoreCase = true) ||
            requestedSubject.equals("सभी विषय", ignoreCase = true)) {
            return true
        }

        val qSub = questionSubject?.trim() ?: ""
        val qTop = questionTopic?.trim() ?: ""
        val tags = questionTags?.map { it.trim().lowercase(Locale.ROOT) } ?: emptyList()
        val req = requestedSubject.trim().lowercase(Locale.ROOT)

        if (qSub.equals(requestedSubject, ignoreCase = true)) return true
        if (tags.contains(req)) return true

        // Physics
        if (req == "physics" || req.contains("भौतिक")) {
            if (qSub.equals("Physics", ignoreCase = true)) return true
            if (qSub.equals("Science", ignoreCase = true) || qSub.equals("General Science", ignoreCase = true)) {
                val kw = listOf("light", "electric", "magnet", "optic", "motion", "force", "sound", "eye", "energy", "ohm", "lens", "mirror", "reflection", "refraction", "heat", "current", "power", "ray", "wave", "solenoid", "fuse", "resistor")
                return kw.any { qTop.contains(it, ignoreCase = true) } || tags.contains("physics")
            }
            return false
        }

        // Chemistry
        if (req == "chemistry" || req.contains("रसायन")) {
            if (qSub.equals("Chemistry", ignoreCase = true)) return true
            if (qSub.equals("Science", ignoreCase = true) || qSub.equals("General Science", ignoreCase = true)) {
                val kw = listOf("acid", "base", "salt", "metal", "reaction", "carbon", "periodic", "bond", "compound", "solution", "atom", "molecule", "redox", "chemical")
                return kw.any { qTop.contains(it, ignoreCase = true) } || tags.contains("chemistry")
            }
            return false
        }

        // Biology
        if (req == "biology" || req.contains("जीव विज्ञान")) {
            if (qSub.equals("Biology", ignoreCase = true)) return true
            if (qSub.equals("Science", ignoreCase = true) || qSub.equals("General Science", ignoreCase = true)) {
                val kw = listOf("life process", "control", "coordination", "reproduction", "heredity", "cell", "human", "heart", "brain", "plant", "circulation", "digestion", "respiration", "kidney", "vitamin", "disease", "organism", "environment", "photosynthesis", "nephron")
                return kw.any { qTop.contains(it, ignoreCase = true) } || tags.contains("biology")
            }
            return false
        }

        // Science umbrella
        if (req == "science" || req.contains("विज्ञान") || req == "general science") {
            return qSub.equals("Science", ignoreCase = true) ||
                   qSub.equals("General Science", ignoreCase = true) ||
                   qSub.equals("Physics", ignoreCase = true) ||
                   qSub.equals("Chemistry", ignoreCase = true) ||
                   qSub.equals("Biology", ignoreCase = true) ||
                   tags.contains("science")
        }

        // Mathematics
        if (req == "mathematics" || req == "math" || req.contains("गणित")) {
            return qSub.equals("Mathematics", ignoreCase = true) ||
                   qSub.equals("Everyday Mathematics", ignoreCase = true) ||
                   tags.contains("mathematics") || tags.contains("math")
        }

        // Social Science
        if (req == "social science" || req.contains("सामाजिक")) {
            return qSub.equals("Social Science", ignoreCase = true) ||
                   qSub.equals("History", ignoreCase = true) ||
                   qSub.equals("Geography", ignoreCase = true) ||
                   qSub.equals("Civics", ignoreCase = true) ||
                   qSub.equals("Economics", ignoreCase = true) ||
                   qSub.equals("Indian History", ignoreCase = true) ||
                   qSub.equals("Indian Geography", ignoreCase = true) ||
                   qSub.equals("Indian Polity", ignoreCase = true)
        }

        // Hindi
        if (req == "hindi" || req.contains("हिंदी")) {
            return qSub.equals("Hindi", ignoreCase = true)
        }

        // English
        if (req == "english" || req.contains("अंग्रेजी")) {
            return qSub.equals("English", ignoreCase = true)
        }

        return false
    }

    private suspend fun getFilteredQuestions(config: QuizConfig): List<Question> {
        val all = questionDao.getAllQuestions()

        return all.filter { q ->
            // Category match
            val categoryMatches = config.category.isNullOrEmpty() || q.category.equals(config.category, ignoreCase = true)

            // Subcategory or Exam/Board match
            val subcategoryMatches = if (!config.examOrBoard.isNullOrEmpty()) {
                (q.examOrBoard != null && q.examOrBoard.equals(config.examOrBoard, ignoreCase = true)) ||
                q.subcategory.equals(config.subcategory, ignoreCase = true)
            } else {
                config.subcategory.isNullOrEmpty() || q.subcategory.equals(config.subcategory, ignoreCase = true)
            }

            // Exam or Board match
            val examMatches = config.examOrBoard.isNullOrEmpty() || (q.examOrBoard != null && q.examOrBoard.equals(config.examOrBoard, ignoreCase = true))

            // Class match
            val classMatches = config.targetClass.isNullOrEmpty() || 
                config.targetClass.equals("ALL", ignoreCase = true) || 
                config.targetClass.equals("All Classes", ignoreCase = true) || 
                (q.targetClass != null && q.targetClass.equals(config.targetClass, ignoreCase = true))

            // Subject match with intelligent subject compatibility
            val subjectMatches = config.subject.isNullOrEmpty() || 
                config.subject.equals("ALL", ignoreCase = true) || 
                config.subject.equals("All Subjects", ignoreCase = true) || 
                isSubjectCompatible(q.subject, q.chapterOrTopic, q.tags, config.subject)

            // Topic match
            val topicMatches = config.chapterOrTopic.isNullOrEmpty() || q.chapterOrTopic.equals(config.chapterOrTopic, ignoreCase = true)

            // Difficulty match
            val diffMatches = config.difficulty.isNullOrEmpty() || config.difficulty.equals("ALL", ignoreCase = true) || q.difficulty.equals(config.difficulty, ignoreCase = true)

            categoryMatches && subcategoryMatches && examMatches && classMatches && subjectMatches && topicMatches && diffMatches
        }
    }

    private suspend fun ensureDatabasePopulated() {
        val currentCount = questionDao.getQuestionCount()
        val defaultList = com.indiaquiz.app.data.local.PrepopulateData.getQuestions()
        if (currentCount < defaultList.size) {
            questionDao.insertAll(defaultList)
        }
    }

    suspend fun getMixedRandomQuestions(count: Int = 10, difficulty: String? = null): List<Question> {
        ensureDatabasePopulated()
        val all = questionDao.getAllQuestions()
        val filtered = if (!difficulty.isNullOrEmpty() && !difficulty.equals("ALL", ignoreCase = true)) {
            all.filter { it.difficulty.equals(difficulty, ignoreCase = true) }
        } else {
            all
        }

        // Balanced distribution across categories
        val byCategory = filtered.groupBy { it.category }
        val result = mutableListOf<Question>()

        // Take from each category to ensure diverse mix
        for ((_, catQuestions) in byCategory) {
            val pick = catQuestions.shuffled().firstOrNull()
            if (pick != null) {
                result.add(pick)
            }
        }

        // Fill remaining up to count
        val remaining = filtered.filterNot { result.contains(it) }.shuffled()
        result.addAll(remaining.take(count - result.size))

        return result.shuffled().take(count)
    }

    suspend fun getDailyQuestions(count: Int = 10): List<Question> {
        ensureDatabasePopulated()
        val all = questionDao.getAllQuestions()
        if (all.isEmpty()) return emptyList()

        val todayDate = SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Date())
        val seed = todayDate.hashCode().toLong()
        val random = Random(seed)

        return all.shuffled(random).take(count)
    }

    suspend fun toggleBookmark(questionId: String, isBookmarked: Boolean) {
        questionDao.updateBookmark(questionId, isBookmarked)
    }

    suspend fun recordQuestionStats(records: List<AttemptQuestionRecord>) {
        for (rec in records) {
            val delta = if (rec.isCorrect) 1 else 0
            questionDao.updateAttemptStats(rec.questionId, delta)
        }
    }

    suspend fun search(query: String): List<Question> {
        ensureDatabasePopulated()
        return questionDao.searchQuestions(query.trim())
    }

    suspend fun getQuestionById(id: String): Question? {
        return questionDao.getQuestionById(id)
    }
}
