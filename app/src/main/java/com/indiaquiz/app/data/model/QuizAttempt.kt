package com.indiaquiz.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "quiz_attempts")
data class QuizAttempt(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val timestamp: Long = System.currentTimeMillis(),
    val quizTitle: String,
    val category: String,
    val quizMode: String, // "PRACTICE", "EXAM", "QUICK_MIXED", "DAILY", "CHALLENGE", "BOOKMARKS"
    val totalQuestions: Int,
    val correctCount: Int,
    val wrongCount: Int,
    val skippedCount: Int,
    val score: Float,
    val maxScore: Float,
    val accuracyPercentage: Float,
    val timeTakenSeconds: Long,
    val difficulty: String,
    val detailsJson: String = "" // Serialized list of AttemptQuestionRecord for in-depth review
) : Serializable

data class AttemptQuestionRecord(
    val questionId: String,
    val selectedOptionIndex: Int,
    val isCorrect: Boolean,
    val timeSpentSeconds: Int
) : Serializable
