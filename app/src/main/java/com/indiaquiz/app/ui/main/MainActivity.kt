package com.indiaquiz.app.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.R
import com.indiaquiz.app.data.local.PrepopulateData
import com.indiaquiz.app.data.model.CategoryItem
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.databinding.ActivityMainBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.analytics.AnalyticsActivity
import com.indiaquiz.app.ui.bookmarks.BookmarksActivity
import com.indiaquiz.app.ui.category.CategoryAdapter
import com.indiaquiz.app.ui.category.CategoryExplorerActivity
import com.indiaquiz.app.ui.quiz.QuizActivity
import com.indiaquiz.app.ui.search.SearchActivity
import com.indiaquiz.app.ui.settings.SettingsActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var prefs: PreferenceHelper
    private lateinit var authManager: com.indiaquiz.app.util.AuthManager
    private lateinit var categoryAdapter: CategoryAdapter
    private var currentThemeKey: String = ""

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        authManager = (application as IndiaQuizApp).authManager
        currentThemeKey = prefs.selectedTheme
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ensure header content never hides under the system status bar
        binding.toolbar.applyStatusBarPadding()

        setupTopBarAndStreak()
        setupQuickQuizCta()
        setupCategoriesList()
    }

    override fun onResume() {
        super.onResume()
        updateStreakDisplay()
        updateHeaderUserDisplay()
        // If theme was changed automatically by selecting a quiz type, adapt MainActivity
        if (currentThemeKey.isNotEmpty() && currentThemeKey != prefs.selectedTheme) {
            currentThemeKey = prefs.selectedTheme
            recreate()
        }
    }

    private fun setupTopBarAndStreak() {
        updateStreakDisplay()
        updateHeaderUserDisplay()

        binding.ivHeaderLogo.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        binding.ivBookmarks.setOnClickListener {
            startActivity(Intent(this, BookmarksActivity::class.java))
        }

        binding.ivAnalytics.setOnClickListener {
            startActivity(Intent(this, AnalyticsActivity::class.java))
        }

        binding.ivSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        binding.cardSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }
    }

    private fun updateStreakDisplay() {
        val streak = prefs.dailyStreak
        val isHindi = prefs.selectedLanguage == "hi"
        binding.tvStreakCount.text = if (isHindi) "$streak दिन" else "$streak Days"
    }

    private fun updateHeaderUserDisplay() {
        val user = authManager.getCurrentUser()
        val isHindi = prefs.selectedLanguage == "hi"
        if (authManager.isLoggedIn()) {
            binding.tvHeaderSubtitle.text = "${if (isHindi) "नमस्ते, " else "Namaste, "}${user.displayName} • ${user.targetExamOrClass}"
        } else {
            binding.tvHeaderSubtitle.text = "${if (isHindi) "लक्ष्य: " else "Goal: "}${user.targetExamOrClass}"
        }
    }

    private fun setupQuickQuizCta() {
        // Mode 2: Quick Mixed Quiz - One tap immediate play!
        binding.btnQuickStartNow.setOnClickListener {
            ThemeManager.setCurrentTheme(this, ThemeManager.THEME_MIXED)
            val config = QuizConfig(
                title = if (prefs.selectedLanguage == "hi") "त्वरित मिश्रित क्विज़" else "Quick Mixed Quiz",
                category = "QUICK_MIXED",
                mode = "QUICK_MIXED",
                questionCount = 10,
                difficulty = "ALL",
                enableNegativeMarking = prefs.isNegativeMarkingEnabled,
                timePerQuestionSeconds = prefs.perQuestionTimerSeconds
            )
            launchQuiz(config)
        }

        binding.btnSurpriseMe.setOnClickListener {
            ThemeManager.setCurrentTheme(this, ThemeManager.THEME_MIXED)
            val config = QuizConfig(
                title = if (prefs.selectedLanguage == "hi") "सरप्राइज क्विज़" else "Surprise Mixed Quiz",
                category = "QUICK_MIXED",
                mode = "QUICK_MIXED",
                questionCount = 10,
                difficulty = "ALL",
                enableNegativeMarking = prefs.isNegativeMarkingEnabled,
                timePerQuestionSeconds = prefs.perQuestionTimerSeconds
            )
            launchQuiz(config)
        }

        // Daily Challenge Quiz
        binding.btnStartDailyQuiz.setOnClickListener {
            ThemeManager.setCurrentTheme(this, ThemeManager.THEME_COMPETITIVE)
            val config = QuizConfig(
                title = if (prefs.selectedLanguage == "hi") "आज का दैनिक क्विज़" else "Today's Daily Quiz",
                category = "DAILY",
                mode = "DAILY",
                questionCount = 10,
                difficulty = "ALL",
                enableNegativeMarking = prefs.isNegativeMarkingEnabled,
                timePerQuestionSeconds = prefs.perQuestionTimerSeconds
            )
            launchQuiz(config)
        }
    }

    private fun setupCategoriesList() {
        val isHindi = prefs.selectedLanguage == "hi"
        val categories = PrepopulateData.getCategories()

        categoryAdapter = CategoryAdapter { category ->
            onCategoryClicked(category)
        }
        binding.rvCategories.layoutManager = LinearLayoutManager(this)
        binding.rvCategories.adapter = categoryAdapter
        categoryAdapter.submitList(categories, isHindi)

        binding.tvViewAllCategories.setOnClickListener {
            // Smoothly scroll down to categories
            binding.rvCategories.smoothScrollToPosition(0)
        }
    }

    private fun onCategoryClicked(category: CategoryItem) {
        ThemeManager.setCurrentTheme(this, ThemeManager.getThemeForCategory(category.id))
        val intent = Intent(this, CategoryExplorerActivity::class.java).apply {
            putExtra("EXTRA_CATEGORY_ITEM", category)
        }
        startActivity(intent)
    }

    private fun launchQuiz(config: QuizConfig) {
        val intent = Intent(this, QuizActivity::class.java).apply {
            putExtra("EXTRA_QUIZ_CONFIG", config)
        }
        startActivity(intent)
    }
}
