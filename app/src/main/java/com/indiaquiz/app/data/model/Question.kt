package com.indiaquiz.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "questions")
data class Question(
    @PrimaryKey
    val id: String,
    val questionText: String,
    val questionTextHindi: String? = null,
    val category: String, // e.g. "COMPETITIVE_EXAMS", "SCHOOL_EDUCATION", "GENERAL_KNOWLEDGE", "REASONING", "MATHEMATICS", "HINDI_LANGUAGE", "ENGLISH_LANGUAGE", "ITI_TECHNICAL", "HOMEMAKER_EVERYDAY"
    val subcategory: String, // e.g. "UPSC", "SSC", "RAILWAY", "BANKING", "CBSE", "RBSE", "INDIAN_HISTORY", "ELECTRICIAN", "KITCHEN_HEALTH"
    val examOrBoard: String? = null, // e.g. "UPSC", "CBSE", "RBSE", "SSC CGL"
    val targetClass: String? = null, // e.g. "Class 10", "Class 12"
    val subject: String? = null, // e.g. "Mathematics", "Physics", "General Awareness"
    val chapterOrTopic: String, // e.g. "Trigonometry", "Indus Valley", "Electric Circuits", "Lokoktiyan"
    val difficulty: String = "MEDIUM", // "EASY", "MEDIUM", "HARD"
    val language: String = "BOTH", // "HI", "EN", "BOTH"
    val options: List<String>,
    val optionsHindi: List<String>? = null,
    val correctAnswerIndex: Int, // 0..3
    val explanation: String,
    val explanationHindi: String? = null,
    val negativeMarks: Float = 0.25f,
    val questionType: String = "SINGLE_CHOICE",
    val tags: List<String> = emptyList(),
    var isBookmarked: Boolean = false,
    var timesAttempted: Int = 0,
    var timesCorrect: Int = 0
) : Serializable
