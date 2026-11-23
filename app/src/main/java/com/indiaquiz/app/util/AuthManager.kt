package com.indiaquiz.app.util

import android.content.Context
import android.content.SharedPreferences
import com.indiaquiz.app.data.model.UserProfile
import java.util.UUID

class AuthManager(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences("india_quiz_auth", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_USER_ID = "auth_user_id"
        private const val KEY_DISPLAY_NAME = "auth_display_name"
        private const val KEY_EMAIL_PHONE = "auth_email_phone"
        private const val KEY_AUTH_PROVIDER = "auth_provider"
        private const val KEY_TARGET_GOAL = "auth_target_goal"
        private const val KEY_IS_VERIFIED = "auth_is_verified"
        private const val KEY_JOINED_TIME = "auth_joined_time"
    }

    fun isLoggedIn(): Boolean {
        val provider = prefs.getString(KEY_AUTH_PROVIDER, "GUEST") ?: "GUEST"
        return provider != "GUEST"
    }

    fun getCurrentUser(): UserProfile {
        val id = prefs.getString(KEY_USER_ID, "guest_${UUID.randomUUID().toString().take(6)}") ?: "guest_user"
        val name = prefs.getString(KEY_DISPLAY_NAME, "Guest Learner") ?: "Guest Learner"
        val emailPhone = prefs.getString(KEY_EMAIL_PHONE, "") ?: ""
        val provider = prefs.getString(KEY_AUTH_PROVIDER, "GUEST") ?: "GUEST"
        val target = prefs.getString(KEY_TARGET_GOAL, "All Categories") ?: "All Categories"
        val isVerified = prefs.getBoolean(KEY_IS_VERIFIED, false)
        val joinedTime = prefs.getLong(KEY_JOINED_TIME, System.currentTimeMillis())

        return UserProfile(
            id = id,
            displayName = name,
            emailOrPhone = emailPhone,
            authProvider = provider,
            targetExamOrClass = target,
            isVerified = isVerified,
            joinedTimestamp = joinedTime
        )
    }

    fun signInWithGoogle(displayName: String, email: String, targetGoal: String): UserProfile {
        val profile = UserProfile(
            id = "google_" + UUID.randomUUID().toString().take(8),
            displayName = if (displayName.isNotBlank()) displayName else "Google Scholar",
            emailOrPhone = email,
            authProvider = "GOOGLE",
            targetExamOrClass = targetGoal,
            isVerified = true,
            joinedTimestamp = System.currentTimeMillis()
        )
        saveProfile(profile)
        return profile
    }

    fun signInWithPhone(phoneNumber: String, displayName: String, targetGoal: String): UserProfile {
        val profile = UserProfile(
            id = "phone_" + UUID.randomUUID().toString().take(8),
            displayName = if (displayName.isNotBlank()) displayName else "Aspirant",
            emailOrPhone = phoneNumber,
            authProvider = "PHONE",
            targetExamOrClass = targetGoal,
            isVerified = true,
            joinedTimestamp = System.currentTimeMillis()
        )
        saveProfile(profile)
        return profile
    }

    fun signInWithEmail(email: String, displayName: String, targetGoal: String): UserProfile {
        val profile = UserProfile(
            id = "email_" + UUID.randomUUID().toString().take(8),
            displayName = if (displayName.isNotBlank()) displayName else "Student",
            emailOrPhone = email,
            authProvider = "EMAIL",
            targetExamOrClass = targetGoal,
            isVerified = true,
            joinedTimestamp = System.currentTimeMillis()
        )
        saveProfile(profile)
        return profile
    }

    fun updateProfile(displayName: String, targetGoal: String) {
        prefs.edit()
            .putString(KEY_DISPLAY_NAME, displayName)
            .putString(KEY_TARGET_GOAL, targetGoal)
            .apply()
    }

    fun signOut(): UserProfile {
        prefs.edit().clear().apply()
        return getCurrentUser()
    }

    private fun saveProfile(profile: UserProfile) {
        prefs.edit()
            .putString(KEY_USER_ID, profile.id)
            .putString(KEY_DISPLAY_NAME, profile.displayName)
            .putString(KEY_EMAIL_PHONE, profile.emailOrPhone)
            .putString(KEY_AUTH_PROVIDER, profile.authProvider)
            .putString(KEY_TARGET_GOAL, profile.targetExamOrClass)
            .putBoolean(KEY_IS_VERIFIED, profile.isVerified)
            .putLong(KEY_JOINED_TIME, profile.joinedTimestamp)
            .apply()
    }
}
