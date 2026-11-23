package com.indiaquiz.app.theme

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import com.indiaquiz.app.R
import com.indiaquiz.app.util.PreferenceHelper

object ThemeManager {

    const val THEME_ACADEMIC = "ACADEMIC"
    const val THEME_TECHNICAL = "TECHNICAL"
    const val THEME_COMPETITIVE = "COMPETITIVE"
    const val THEME_GK = "GK"
    const val THEME_HOMEMAKER = "HOMEMAKER"
    const val THEME_MIXED = "MIXED"
    const val THEME_DARK = "DARK"
    const val THEME_ADAPTIVE = "ADAPTIVE"

    /**
     * Dynamically map a selected quiz type or category ID to its corresponding Material theme.
     * School/Board -> Academic Blue
     * ITI & Trades -> Technical Teal/Slate
     * Competitive Exams / Daily -> Saffron Gold
     * Homemaker / Daily Life -> Warm Terracotta
     * GK -> Emerald
     * Mixed / Reasoning -> Dynamic Purple
     */
    fun getThemeForCategory(categoryId: String?): String {
        if (categoryId.isNullOrBlank()) return THEME_MIXED
        return when (categoryId.lowercase()) {
            "competitive_exams", "upsc", "ssc", "railway", "banking", "defence", "daily", "competitive" -> THEME_COMPETITIVE
            "school_education", "cbse", "rbse", "bihar_board", "up_board", "icse", "mathematics" -> THEME_ACADEMIC
            "technical_iti", "iti", "electrician", "fitter", "welder", "electronics", "trade" -> THEME_TECHNICAL
            "homemaker_daily", "homemaker", "everyday", "languages", "hindi", "english" -> THEME_HOMEMAKER
            "general_knowledge", "gk" -> THEME_GK
            "quick_mixed", "reasoning", "mixed", "surprise" -> THEME_MIXED
            else -> THEME_ACADEMIC
        }
    }

    /**
     * Applies the theme to the activity.
     * When categoryId is supplied, the theme automatically adapts to that quiz type
     * and persists, fulfilling the requirement that selecting a quiz type changes the theme
     * automatically without manual selection from the settings screen.
     */
    fun applyTheme(activity: Activity, categoryId: String? = null) {
        val prefs = PreferenceHelper(activity)
        val isDark = prefs.selectedTheme == THEME_DARK

        if (isDark) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            activity.setTheme(R.style.Theme_IndiaQuiz_Dark)
            return
        }

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        // Automatically adapt to selected category/quiz type
        val themeKey = if (!categoryId.isNullOrBlank()) {
            val adapted = getThemeForCategory(categoryId)
            prefs.selectedTheme = adapted
            adapted
        } else {
            prefs.selectedTheme
        }

        val styleResId = when (themeKey) {
            THEME_TECHNICAL -> R.style.Theme_IndiaQuiz_Technical
            THEME_COMPETITIVE -> R.style.Theme_IndiaQuiz_Competitive
            THEME_GK -> R.style.Theme_IndiaQuiz_GK
            THEME_HOMEMAKER -> R.style.Theme_IndiaQuiz_Homemaker
            THEME_MIXED -> R.style.Theme_IndiaQuiz_Mixed
            else -> R.style.Theme_IndiaQuiz_Academic
        }

        activity.setTheme(styleResId)
    }

    fun setCurrentTheme(context: Context, themeKey: String) {
        val prefs = PreferenceHelper(context)
        prefs.selectedTheme = themeKey
    }
}
