package com.indiaquiz.app.data.local

import androidx.room.*
import com.indiaquiz.app.data.model.QuizAttempt
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizAttemptDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAttempt(attempt: QuizAttempt): Long

    @Query("SELECT * FROM quiz_attempts ORDER BY timestamp DESC")
    fun getAllAttemptsFlow(): Flow<List<QuizAttempt>>

    @Query("SELECT * FROM quiz_attempts ORDER BY timestamp DESC")
    suspend fun getAllAttempts(): List<QuizAttempt>

    @Query("SELECT * FROM quiz_attempts WHERE id = :attemptId LIMIT 1")
    suspend fun getAttemptById(attemptId: Long): QuizAttempt?

    @Query("SELECT COUNT(*) FROM quiz_attempts")
    suspend fun getTotalAttemptsCount(): Int

    @Query("SELECT AVG(accuracyPercentage) FROM quiz_attempts")
    suspend fun getAverageAccuracy(): Float?

    @Query("SELECT MAX(score) FROM quiz_attempts")
    suspend fun getBestScore(): Float?

    @Query("SELECT * FROM quiz_attempts WHERE category = :category ORDER BY timestamp DESC")
    suspend fun getAttemptsByCategory(category: String): List<QuizAttempt>

    @Query("DELETE FROM quiz_attempts")
    suspend fun clearHistory()
}
