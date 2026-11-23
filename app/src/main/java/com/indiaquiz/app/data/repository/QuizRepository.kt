package com.indiaquiz.app.data.repository

import com.indiaquiz.app.data.local.QuizAttemptDao
import com.indiaquiz.app.data.model.QuizAttempt
import kotlinx.coroutines.flow.Flow

data class AnalyticsOverview(
    val totalAttempts: Int,
    val averageAccuracy: Float,
    val bestScore: Float,
    val totalQuestionsAnswered: Int
)

class QuizRepository(private val quizAttemptDao: QuizAttemptDao) {

    val allAttemptsFlow: Flow<List<QuizAttempt>> = quizAttemptDao.getAllAttemptsFlow()

    suspend fun saveAttempt(attempt: QuizAttempt): Long {
        return quizAttemptDao.insertAttempt(attempt)
    }

    suspend fun getAttemptById(attemptId: Long): QuizAttempt? {
        return quizAttemptDao.getAttemptById(attemptId)
    }

    suspend fun getAnalyticsOverview(): AnalyticsOverview {
        val count = quizAttemptDao.getTotalAttemptsCount()
        val avgAcc = quizAttemptDao.getAverageAccuracy() ?: 0f
        val best = quizAttemptDao.getBestScore() ?: 0f
        val attempts = quizAttemptDao.getAllAttempts()
        val totalQuestions = attempts.sumOf { it.totalQuestions }

        return AnalyticsOverview(
            totalAttempts = count,
            averageAccuracy = avgAcc,
            bestScore = best,
            totalQuestionsAnswered = totalQuestions
        )
    }

    suspend fun clearHistory() {
        quizAttemptDao.clearHistory()
    }
}
