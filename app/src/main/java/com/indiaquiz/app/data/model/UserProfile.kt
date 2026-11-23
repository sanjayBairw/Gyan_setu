package com.indiaquiz.app.data.model

import java.io.Serializable

data class UserProfile(
    val id: String = "guest_user",
    val displayName: String = "Guest Learner",
    val emailOrPhone: String = "",
    val authProvider: String = "GUEST", // "GUEST", "GOOGLE", "PHONE", "EMAIL"
    val targetExamOrClass: String = "General Knowledge",
    val isVerified: Boolean = false,
    val joinedTimestamp: Long = System.currentTimeMillis()
) : Serializable
