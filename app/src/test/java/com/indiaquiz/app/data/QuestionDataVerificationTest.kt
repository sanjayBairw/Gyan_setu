package com.indiaquiz.app.data

import com.indiaquiz.app.data.local.PrepopulateData
import org.junit.Assert.*
import org.junit.Test

class QuestionDataVerificationTest {

    @Test
    fun testAllQuestionsIntegrity() {
        val questions = PrepopulateData.getQuestions()
        assertTrue("Total questions should be at least 380 (has ${questions.size})", questions.size >= 380)

        val idSet = mutableSetOf<String>()
        for (q in questions) {
            // Check unique IDs
            assertFalse("Duplicate question ID: ${q.id}", idSet.contains(q.id))
            idSet.add(q.id)

            // Check non-empty text
            assertTrue("Question text empty for ${q.id}", q.questionText.isNotBlank())
            assertTrue("Hindi text empty for ${q.id}", !q.questionTextHindi.isNullOrBlank())

            // Check options
            assertEquals("Question ${q.id} must have 4 options", 4, q.options.size)
            assertTrue("Invalid correctAnswerIndex for ${q.id}", q.correctAnswerIndex in 0..3)

            // Check explanations
            assertTrue("Explanation empty for ${q.id}", q.explanation.isNotBlank())
            assertTrue("Hindi explanation empty for ${q.id}", !q.explanationHindi.isNullOrBlank())
        }
    }

    @Test
    fun testAllSubcategoriesHaveAtLeast10Questions() {
        val questions = PrepopulateData.getQuestions()
        val categories = PrepopulateData.getCategories()

        for (cat in categories) {
            for (subcat in cat.subcategories) {
                val matching = questions.filter { q ->
                    (q.subcategory.equals(subcat.id, ignoreCase = true)) ||
                    (!subcat.examOrBoard.isNullOrEmpty() && q.examOrBoard.equals(subcat.examOrBoard, ignoreCase = true))
                }
                assertTrue(
                    "Subcategory ${subcat.id} (${subcat.nameEn}) in ${cat.id} must have at least 10 questions, but has ${matching.size}",
                    matching.size >= 10
                )
            }
        }
    }

    @Test
    fun testEveryExamHasAtLeast10Questions() {
        val questions = PrepopulateData.getQuestions()
        val railwayCount = questions.count { it.examOrBoard == "Railway" || it.subcategory == "RAILWAY" }
        val bankingCount = questions.count { it.examOrBoard == "Banking" || it.subcategory == "BANKING" }
        val sscCount = questions.count { it.examOrBoard == "SSC" || it.subcategory == "SSC" }
        val upscCount = questions.count { it.examOrBoard == "UPSC" || it.subcategory == "UPSC" }
        val defenceCount = questions.count { it.examOrBoard == "Defence" || it.subcategory == "DEFENCE" }
        val biharCount = questions.count { it.examOrBoard == "Bihar Board" || it.subcategory == "BIHAR_BOARD" }
        val upCount = questions.count { it.examOrBoard == "UP Board" || it.subcategory == "UP_BOARD" }

        assertTrue("Railway must have at least 10 questions (has $railwayCount)", railwayCount >= 10)
        assertTrue("Banking must have at least 10 questions (has $bankingCount)", bankingCount >= 10)
        assertTrue("SSC must have at least 10 questions (has $sscCount)", sscCount >= 10)
        assertTrue("UPSC must have at least 10 questions (has $upscCount)", upscCount >= 10)
        assertTrue("Defence must have at least 10 questions (has $defenceCount)", defenceCount >= 10)
        assertTrue("Bihar Board must have at least 10 questions (has $biharCount)", biharCount >= 10)
        assertTrue("UP Board must have at least 10 questions (has $upCount)", upCount >= 10)
    }

    @Test
    fun testJeeMainAdvancedQuestions() {
        val questions = PrepopulateData.getQuestions()
        val jeeQuestions = questions.filter { it.examOrBoard == "JEE" || it.subcategory == "JEE_MAIN_ADVANCED" }

        assertTrue("JEE questions count should be at least 15", jeeQuestions.size >= 15)

        val subjects = jeeQuestions.map { it.subject }.toSet()
        assertTrue("Must have JEE Physics", subjects.contains("Physics"))
        assertTrue("Must have JEE Chemistry", subjects.contains("Chemistry"))
        assertTrue("Must have JEE Mathematics", subjects.contains("Mathematics"))
    }

    @Test
    fun testCbseBoardSubjectWiseQuestions() {
        val questions = PrepopulateData.getQuestions()
        val cbseQuestions = questions.filter { it.examOrBoard == "CBSE" }

        assertTrue("CBSE questions count should be at least 15", cbseQuestions.size >= 15)

        val class10 = cbseQuestions.filter { it.targetClass == "Class 10" }
        val class12 = cbseQuestions.filter { it.targetClass == "Class 12" }

        assertTrue("CBSE Class 10 should have questions", class10.isNotEmpty())
        assertTrue("CBSE Class 12 should have questions", class12.isNotEmpty())

        val class10Subjects = class10.map { it.subject }.toSet()
        assertTrue("CBSE 10 should have Mathematics", class10Subjects.contains("Mathematics"))
        assertTrue("CBSE 10 should have Science", class10Subjects.contains("Science"))

        val class12Subjects = class12.map { it.subject }.toSet()
        assertTrue("CBSE 12 should have Physics", class12Subjects.contains("Physics"))
        assertTrue("CBSE 12 should have Chemistry", class12Subjects.contains("Chemistry"))
    }

    @Test
    fun testRbseBoardSubjectWiseQuestions() {
        val questions = PrepopulateData.getQuestions()
        val rbseQuestions = questions.filter { it.examOrBoard == "RBSE" }

        assertTrue("RBSE questions count should be at least 14", rbseQuestions.size >= 14)

        val class10 = rbseQuestions.filter { it.targetClass == "Class 10" }
        val class12 = rbseQuestions.filter { it.targetClass == "Class 12" }

        assertTrue("RBSE Class 10 should have questions", class10.isNotEmpty())
        assertTrue("RBSE Class 12 should have questions", class12.isNotEmpty())

        val class10Subjects = class10.map { it.subject }.toSet()
        assertTrue("RBSE 10 should have Mathematics", class10Subjects.contains("Mathematics"))
        assertTrue("RBSE 10 should have Science", class10Subjects.contains("Science"))
        assertTrue("RBSE 10 should have Social Science", class10Subjects.contains("Social Science"))

        val class12Subjects = class12.map { it.subject }.toSet()
        assertTrue("RBSE 12 should have Physics", class12Subjects.contains("Physics"))
        assertTrue("RBSE 12 should have Chemistry", class12Subjects.contains("Chemistry"))
        assertTrue("RBSE 12 should have Biology", class12Subjects.contains("Biology"))
        assertTrue("RBSE 12 should have Mathematics", class12Subjects.contains("Mathematics"))
    }

    @Test
    fun testClass1To9QuestionsCoverage() {
        val questions = PrepopulateData.getQuestions()
        val cbseClasses = questions.filter { it.examOrBoard == "CBSE" }.mapNotNull { it.targetClass }.toSet()
        val rbseClasses = questions.filter { it.examOrBoard == "RBSE" }.mapNotNull { it.targetClass }.toSet()

        assertTrue("CBSE must support Class 1", cbseClasses.contains("Class 1"))
        assertTrue("CBSE must support Class 5", cbseClasses.contains("Class 5"))
        assertTrue("CBSE must support Class 9", cbseClasses.contains("Class 9"))

        assertTrue("RBSE must support Class 3", rbseClasses.contains("Class 3"))
        assertTrue("RBSE must support Class 5", rbseClasses.contains("Class 5"))
        assertTrue("RBSE must support Class 8", rbseClasses.contains("Class 8"))
        assertTrue("RBSE must support Class 9", rbseClasses.contains("Class 9"))
    }

    @Test
    fun testClass10PhysicsQuestionsCoverage() {
        val questions = PrepopulateData.getQuestions()
        val class10Physics = questions.filter { 
            it.targetClass == "Class 10" && (it.subject == "Physics" || it.tags.contains("Physics"))
        }

        assertTrue("Class 10 must have at least 20 Physics questions (has ${class10Physics.size})", class10Physics.size >= 20)

        val cbse10Phys = class10Physics.filter { it.examOrBoard == "CBSE" }
        val rbse10Phys = class10Physics.filter { it.examOrBoard == "RBSE" }

        assertTrue("CBSE Class 10 must have at least 10 Physics questions (has ${cbse10Phys.size})", cbse10Phys.size >= 10)
        assertTrue("RBSE Class 10 must have at least 10 Physics questions (has ${rbse10Phys.size})", rbse10Phys.size >= 10)

        for (q in class10Physics) {
            assertTrue("Physics question ${q.id} must have Physics tag", q.tags.contains("Physics"))
            assertTrue("Physics question ${q.id} text must not be empty", q.questionText.isNotBlank())
            assertEquals("Physics question ${q.id} must have 4 options", 4, q.options.size)
        }
    }

    @Test
    fun testQuizTypeIsolationRepository() = kotlinx.coroutines.runBlocking {
        val allQuestions = PrepopulateData.getQuestions()
        val fakeDao = object : com.indiaquiz.app.data.local.QuestionDao {
            override suspend fun getAllQuestions(): List<com.indiaquiz.app.data.model.Question> = allQuestions
            override suspend fun getQuestionCount(): Int = allQuestions.size
            override suspend fun insertAll(questions: List<com.indiaquiz.app.data.model.Question>) {}
            override suspend fun update(question: com.indiaquiz.app.data.model.Question) {}
            override fun getAllQuestionsFlow(): kotlinx.coroutines.flow.Flow<List<com.indiaquiz.app.data.model.Question>> = kotlinx.coroutines.flow.flowOf(allQuestions)
            override suspend fun getQuestionsByCategory(category: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.category == category }
            override suspend fun getQuestionsByCategoryAndDifficulty(category: String, difficulty: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.category == category && it.difficulty == difficulty }
            override suspend fun getQuestionsBySubcategory(subcategory: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.subcategory == subcategory }
            override suspend fun getQuestionsByExamOrBoard(examOrBoard: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.examOrBoard == examOrBoard }
            override suspend fun getQuestionsByBoardAndClass(examOrBoard: String, targetClass: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.examOrBoard == examOrBoard && it.targetClass == targetClass }
            override suspend fun getQuestionsBySubject(subject: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.subject == subject }
            override suspend fun getQuestionsByTopic(topic: String): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.chapterOrTopic == topic }
            override fun getBookmarkedQuestionsFlow(): kotlinx.coroutines.flow.Flow<List<com.indiaquiz.app.data.model.Question>> = kotlinx.coroutines.flow.flowOf(emptyList())
            override suspend fun getBookmarkedQuestionsSync(): List<com.indiaquiz.app.data.model.Question> = emptyList()
            override suspend fun getIncorrectQuestions(): List<com.indiaquiz.app.data.model.Question> = emptyList()
            override suspend fun getQuestionsByIds(ids: List<String>): List<com.indiaquiz.app.data.model.Question> = allQuestions.filter { it.id in ids }
            override suspend fun updateBookmark(questionId: String, isBookmarked: Boolean) {}
            override suspend fun updateAttemptStats(questionId: String, correctDelta: Int) {}
            override suspend fun searchQuestions(query: String): List<com.indiaquiz.app.data.model.Question> = emptyList()
            override suspend fun getQuestionById(id: String): com.indiaquiz.app.data.model.Question? = allQuestions.find { it.id == id }
        }

        val repo = com.indiaquiz.app.data.repository.QuestionRepository(fakeDao)

        // 1. Basic Arithmetic test: Must be 100% Mathematics and BASIC_ARITHMETIC
        val mathConfig = com.indiaquiz.app.data.model.QuizConfig(
            title = "Basic Arithmetic Test",
            category = "MATHEMATICS",
            subcategory = "BASIC_ARITHMETIC",
            subject = "Mathematics",
            questionCount = 10
        )
        val mathQuestions = repo.getQuestionsForQuiz(mathConfig)
        assertEquals("Must return exactly 10 questions", 10, mathQuestions.size)
        for (q in mathQuestions) {
            assertEquals("All questions must belong to MATHEMATICS category", "MATHEMATICS", q.category)
            assertEquals("All questions must belong to BASIC_ARITHMETIC subcategory", "BASIC_ARITHMETIC", q.subcategory)
        }

        // 2. Indian Polity test: Must be 100% GENERAL_KNOWLEDGE and INDIAN_POLITY
        val polityConfig = com.indiaquiz.app.data.model.QuizConfig(
            title = "Polity Test",
            category = "GENERAL_KNOWLEDGE",
            subcategory = "INDIAN_POLITY",
            questionCount = 10
        )
        val polityQuestions = repo.getQuestionsForQuiz(polityConfig)
        assertEquals("Must return exactly 10 questions", 10, polityQuestions.size)
        for (q in polityQuestions) {
            assertEquals("All questions must belong to GENERAL_KNOWLEDGE", "GENERAL_KNOWLEDGE", q.category)
            assertEquals("All questions must belong to INDIAN_POLITY", "INDIAN_POLITY", q.subcategory)
        }

        // 3. Railway test: Must be 100% COMPETITIVE_EXAMS and RAILWAY
        val rlyConfig = com.indiaquiz.app.data.model.QuizConfig(
            title = "Railway Test",
            category = "COMPETITIVE_EXAMS",
            subcategory = "RAILWAY",
            examOrBoard = "Railway",
            questionCount = 10
        )
        val rlyQuestions = repo.getQuestionsForQuiz(rlyConfig)
        assertEquals("Must return exactly 10 questions", 10, rlyQuestions.size)
        for (q in rlyQuestions) {
            assertEquals("All questions must belong to COMPETITIVE_EXAMS", "COMPETITIVE_EXAMS", q.category)
            assertEquals("All questions must belong to RAILWAY", "RAILWAY", q.subcategory)
        }

        // 4. CBSE Class 10 Physics: Must be 100% Class 10 Physics
        val physConfig = com.indiaquiz.app.data.model.QuizConfig(
            title = "CBSE Class 10 Physics",
            category = "SCHOOL_EDUCATION",
            subcategory = "CBSE",
            examOrBoard = "CBSE",
            targetClass = "Class 10",
            subject = "Physics",
            questionCount = 10
        )
        val physQuestions = repo.getQuestionsForQuiz(physConfig)
        assertEquals("Must return exactly 10 questions", 10, physQuestions.size)
        for (q in physQuestions) {
            assertEquals("All questions must belong to SCHOOL_EDUCATION", "SCHOOL_EDUCATION", q.category)
            assertEquals("All questions must be Class 10", "Class 10", q.targetClass)
            assertTrue("All questions must be Physics", q.subject == "Physics" || q.tags.contains("Physics"))
        }

        // 5. RBSE Class 1: Must be 100% Class 1 and MUST NEVER include Class 10 or Solenoid questions!
        val rbseC1Config = com.indiaquiz.app.data.model.QuizConfig(
            title = "RBSE Class 1 Test",
            category = "SCHOOL_EDUCATION",
            subcategory = "RBSE",
            examOrBoard = "RBSE",
            targetClass = "Class 1",
            questionCount = 10
        )
        val rbseC1Questions = repo.getQuestionsForQuiz(rbseC1Config)
        assertEquals("Must return exactly 10 questions", 10, rbseC1Questions.size)
        for (q in rbseC1Questions) {
            assertEquals("All questions must belong to SCHOOL_EDUCATION", "SCHOOL_EDUCATION", q.category)
            assertEquals("Question ${q.id} MUST be Class 1", "Class 1", q.targetClass)
            assertNotEquals("Class 1 quiz must NEVER have Class 10 questions", "Class 10", q.targetClass)
            assertFalse("Class 1 quiz must NEVER have solenoid questions", q.questionText.contains("solenoid", ignoreCase = true))
        }

        // 6. CBSE Class 2: Must be 100% Class 2
        val cbseC2Config = com.indiaquiz.app.data.model.QuizConfig(
            title = "CBSE Class 2 Test",
            category = "SCHOOL_EDUCATION",
            subcategory = "CBSE",
            examOrBoard = "CBSE",
            targetClass = "Class 2",
            questionCount = 10
        )
        val cbseC2Questions = repo.getQuestionsForQuiz(cbseC2Config)
        assertEquals("Must return exactly 10 questions", 10, cbseC2Questions.size)
        for (q in cbseC2Questions) {
            assertEquals("All questions must belong to SCHOOL_EDUCATION", "SCHOOL_EDUCATION", q.category)
            assertEquals("Question ${q.id} MUST be Class 2", "Class 2", q.targetClass)
        }
    }
}
