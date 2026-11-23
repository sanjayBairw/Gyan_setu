package com.indiaquiz.app.engine

import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.UserAnswer
import java.io.Serializable

data class QuizState(
    val currentIndex: Int = 0,
    val totalQuestions: Int = 0,
    val currentQuestion: Question? = null,
    val currentUserAnswer: UserAnswer? = null,
    val isFirstQuestion: Boolean = true,
    val isLastQuestion: Boolean = false,
    val answeredCount: Int = 0,
    val markedForReviewCount: Int = 0,
    val remainingSeconds: Int = 0,
    val isCompleted: Boolean = false
) : Serializable
