package com.indiaquiz.app.util

import android.content.Context
import android.content.SharedPreferences
import java.text.SimpleDateFormat
import java.util.*

class PreferenceHelper(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences("india_quiz_prefs", Context.MODE_PRIVATE)

    companion object {
        const val KEY_THEME = "key_app_theme"
        const val KEY_LANGUAGE = "key_app_language"
        const val KEY_AUTO_TTS = "key_auto_tts"
        const val KEY_TTS_RATE = "key_tts_rate"
        const val KEY_TIMER_SECONDS = "key_timer_seconds"
        const val KEY_NEGATIVE_MARKING = "key_negative_marking"
        const val KEY_DAILY_STREAK = "key_daily_streak"
        const val KEY_LAST_DATE = "key_last_active_date"
        const val KEY_FIRST_RUN = "key_first_run"
    }

    var selectedTheme: String
        get() = prefs.getString(KEY_THEME, "ACADEMIC") ?: "ACADEMIC"
        set(value) = prefs.edit().putString(KEY_THEME, value).apply()

    var selectedLanguage: String
        get() = prefs.getString(KEY_LANGUAGE, "en") ?: "en"
        set(value) = prefs.edit().putString(KEY_LANGUAGE, value).apply()

    var isAutoTtsEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUTO_TTS, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_TTS, value).apply()

    var ttsSpeechRate: Float
        get() = prefs.getFloat(KEY_TTS_RATE, 1.0f)
        set(value) = prefs.edit().putFloat(KEY_TTS_RATE, value).apply()

    var perQuestionTimerSeconds: Int
        get() = prefs.getInt(KEY_TIMER_SECONDS, 45)
        set(value) = prefs.edit().putInt(KEY_TIMER_SECONDS, value).apply()

    var isNegativeMarkingEnabled: Boolean
        get() = prefs.getBoolean(KEY_NEGATIVE_MARKING, true)
        set(value) = prefs.edit().putBoolean(KEY_NEGATIVE_MARKING, value).apply()

    var dailyStreak: Int
        get() = prefs.getInt(KEY_DAILY_STREAK, 1)
        set(value) = prefs.edit().putInt(KEY_DAILY_STREAK, value).apply()

    var isFirstRunCompleted: Boolean
        get() = prefs.getBoolean(KEY_FIRST_RUN, false)
        set(value) = prefs.edit().putBoolean(KEY_FIRST_RUN, value).apply()

    fun updateDailyStreak(): Int {
        val dateFormat = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        val todayStr = dateFormat.format(Date())
        val lastDateStr = prefs.getString(KEY_LAST_DATE, "") ?: ""

        if (lastDateStr == todayStr) {
            // Already counted today
            return dailyStreak
        }

        val cal = Calendar.getInstance()
        cal.add(Calendar.DAY_OF_YEAR, -1)
        val yesterdayStr = dateFormat.format(cal.time)

        val newStreak = if (lastDateStr == yesterdayStr) {
            dailyStreak + 1
        } else {
            1
        }

        prefs.edit()
            .putString(KEY_LAST_DATE, todayStr)
            .putInt(KEY_DAILY_STREAK, newStreak)
            .apply()

        return newStreak
    }

    fun resetPreferences() {
        prefs.edit().clear().apply()
    }
}
