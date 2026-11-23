package com.indiaquiz.app.engine

import com.indiaquiz.app.data.model.AttemptQuestionRecord
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizAttempt
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.data.model.UserAnswer
import com.google.gson.Gson

class QuizEngine(
    val questions: List<Question>,
    val config: QuizConfig
) {
    private var currentIndex = 0
    private val answersMap = mutableMapOf<String, UserAnswer>()
    private val startTimeMillis = System.currentTimeMillis()

    init {
        questions.forEach { q ->
            answersMap[q.id] = UserAnswer(questionId = q.id)
        }
    }

    val totalCount: Int
        get() = questions.size

    fun getCurrentIndex(): Int = currentIndex

    fun getCurrentQuestion(): Question? {
        return questions.getOrNull(currentIndex)
    }

    fun getCurrentAnswer(): UserAnswer? {
        val q = getCurrentQuestion() ?: return null
        return answersMap[q.id]
    }

    fun getAllUserAnswers(): Map<String, UserAnswer> = answersMap

    fun selectOption(optionIndex: Int) {
        val q = getCurrentQuestion() ?: return
        val ans = answersMap.getOrPut(q.id) { UserAnswer(questionId = q.id) }
        ans.selectedOptionIndex = optionIndex
        ans.answeredTimestamp = System.currentTimeMillis()
    }

    fun clearAnswer() {
        val q = getCurrentQuestion() ?: return
        answersMap[q.id]?.selectedOptionIndex = -1
    }

    fun toggleMarkForReview(): Boolean {
        val q = getCurrentQuestion() ?: return false
        val ans = answersMap.getOrPut(q.id) { UserAnswer(questionId = q.id) }
        ans.isMarkedForReview = !ans.isMarkedForReview
        return ans.isMarkedForReview
    }

    fun hasNext(): Boolean = currentIndex < questions.size - 1

    fun hasPrevious(): Boolean = currentIndex > 0

    fun next(): Boolean {
        if (hasNext()) {
            currentIndex++
            return true
        }
        return false
    }

    fun previous(): Boolean {
        if (hasPrevious()) {
            currentIndex--
            return true
        }
        return false
    }

    fun jumpTo(index: Int): Boolean {
        if (index in 0 until questions.size) {
            currentIndex = index
            return true
        }
        return false
    }

    fun getAnsweredCount(): Int = answersMap.values.count { it.isAnswered }

    fun getMarkedForReviewCount(): Int = answersMap.values.count { it.isMarkedForReview }

    fun buildCurrentState(remainingSeconds: Int = 0): QuizState {
        return QuizState(
            currentIndex = currentIndex,
            totalQuestions = questions.size,
            currentQuestion = getCurrentQuestion(),
            currentUserAnswer = getCurrentAnswer(),
            isFirstQuestion = currentIndex == 0,
            isLastQuestion = currentIndex == questions.size - 1,
            answeredCount = getAnsweredCount(),
            markedForReviewCount = getMarkedForReviewCount(),
            remainingSeconds = remainingSeconds
        )
    }

    fun evaluateResult(elapsedTimeSeconds: Long): Pair<QuizAttempt, List<AttemptQuestionRecord>> {
        var correctCount = 0
        var wrongCount = 0
        var skippedCount = 0
        var totalScore = 0f
        val records = mutableListOf<AttemptQuestionRecord>()

        questions.forEach { question ->
            val ans = answersMap[question.id]
            val chosen = ans?.selectedOptionIndex ?: -1

            if (chosen == -1) {
                skippedCount++
                records.add(
                    AttemptQuestionRecord(
                        questionId = question.id,
                        selectedOptionIndex = -1,
                        isCorrect = false,
                        timeSpentSeconds = ans?.timeSpentSeconds ?: 0
                    )
                )
            } else if (chosen == question.correctAnswerIndex) {
                correctCount++
                totalScore += 1.0f
                records.add(
                    AttemptQuestionRecord(
                        questionId = question.id,
                        selectedOptionIndex = chosen,
                        isCorrect = true,
                        timeSpentSeconds = ans?.timeSpentSeconds ?: 0
                    )
                )
            } else {
                wrongCount++
                if (config.enableNegativeMarking) {
                    totalScore -= question.negativeMarks
                }
                records.add(
                    AttemptQuestionRecord(
                        questionId = question.id,
                        selectedOptionIndex = chosen,
                        isCorrect = false,
                        timeSpentSeconds = ans?.timeSpentSeconds ?: 0
                    )
                )
            }
        }

        // Clamp total score to non-negative if desired, or let competitive score show exact value
        if (totalScore < 0f) totalScore = 0f

        val maxScore = questions.size.toFloat()
        val accuracy = if (correctCount + wrongCount > 0) {
            (correctCount.toFloat() / (correctCount + wrongCount)) * 100f
        } else {
            0f
        }

        val detailsJson = Gson().toJson(records)

        val attempt = QuizAttempt(
            timestamp = System.currentTimeMillis(),
            quizTitle = config.title,
            category = config.category ?: "GENERAL",
            quizMode = config.mode,
            totalQuestions = questions.size,
            correctCount = correctCount,
            wrongCount = wrongCount,
            skippedCount = skippedCount,
            score = totalScore,
            maxScore = maxScore,
            accuracyPercentage = accuracy,
            timeTakenSeconds = elapsedTimeSeconds,
            difficulty = config.difficulty,
            detailsJson = detailsJson
        )

        return Pair(attempt, records)
    }
}
