package com.indiaquiz.app.data.model

import java.io.Serializable

data class QuizConfig(
    val title: String = "Quiz",
    val category: String? = null,
    val subcategory: String? = null,
    val examOrBoard: String? = null,
    val targetClass: String? = null,
    val subject: String? = null,
    val chapterOrTopic: String? = null,
    val difficulty: String = "ALL", // "ALL", "EASY", "MEDIUM", "HARD"
    val questionCount: Int = 10,
    val mode: String = "EXAM", // "PRACTICE", "EXAM", "QUICK_MIXED", "DAILY", "CHALLENGE", "BOOKMARKS", "INCORRECT_RETRY"
    val enableNegativeMarking: Boolean = true,
    val timePerQuestionSeconds: Int = 45,
    val specificQuestionIds: List<String>? = null
) : Serializable
