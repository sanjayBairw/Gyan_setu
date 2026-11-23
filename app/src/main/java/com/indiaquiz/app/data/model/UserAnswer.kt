package com.indiaquiz.app.data.model

import java.io.Serializable

data class UserAnswer(
    val questionId: String,
    var selectedOptionIndex: Int = -1, // -1 means skipped or unanswered
    var isMarkedForReview: Boolean = false,
    var timeSpentSeconds: Int = 0,
    var answeredTimestamp: Long = 0L
) : Serializable {
    val isAnswered: Boolean
        get() = selectedOptionIndex >= 0
}
