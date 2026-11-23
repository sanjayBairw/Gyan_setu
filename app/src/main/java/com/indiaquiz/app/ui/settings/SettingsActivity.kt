package com.indiaquiz.app.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.R
import com.indiaquiz.app.databinding.ActivitySettingsBinding
import com.indiaquiz.app.databinding.DialogAuthBottomSheetBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.main.MainActivity
import com.indiaquiz.app.util.AuthManager
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding
    private lateinit var prefs: PreferenceHelper
    private lateinit var authManager: AuthManager

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        authManager = (application as IndiaQuizApp).authManager
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarSettings.applyStatusBarPadding()

        setupToolbar()
        updateProfileCard()
        loadCurrentPreferences()
        setupListeners()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarSettings)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarSettings.setNavigationOnClickListener {
            finish()
        }
    }

    private fun updateProfileCard() {
        val user = authManager.getCurrentUser()
        val isHindi = prefs.selectedLanguage == "hi"

        binding.tvProfileName.text = user.displayName
        if (authManager.isLoggedIn()) {
            binding.tvProfileStatus.text = if (isHindi) "सत्यापित शिक्षार्थी • ऑल इंडिया रैंक सक्रिय" else "Verified Learner • All-India Rank Active"
            binding.tvProfileStatus.setTextColor(getColor(R.color.correct_green))
            binding.btnAuthAction.text = if (isHindi) "साइन आउट" else "Sign Out"
            binding.btnEditProfile.text = if (isHindi) "लक्ष्य बदलें" else "Edit Goal"
        } else {
            binding.tvProfileStatus.text = if (isHindi) "अतिथि मोड (स्थानीय अभ्यास)" else "Guest Mode (Local Practice)"
            binding.tvProfileStatus.setTextColor(getColor(R.color.text_secondary))
            binding.btnAuthAction.text = if (isHindi) "साइन इन / सिंक" else "Sign In / Sync"
            binding.btnEditProfile.text = if (isHindi) "लक्ष्य चुनें" else "Choose Goal"
        }
        binding.tvProfileGoal.text = "${if (isHindi) "लक्ष्य: " else "Goal: "}${user.targetExamOrClass}"
    }

    private fun showAuthDialog() {
        val isHindi = prefs.selectedLanguage == "hi"
        val dialogBinding = DialogAuthBottomSheetBinding.inflate(layoutInflater)
        val dialog = MaterialAlertDialogBuilder(this)
            .setView(dialogBinding.root)
            .create()

        dialogBinding.btnAuthGoogle.setOnClickListener {
            val name = dialogBinding.etAuthName.text.toString().trim()
            val selectedGoal = getSelectedGoalFromChips(dialogBinding)
            authManager.signInWithGoogle(if (name.isNotEmpty()) name else "Aspirant", "aspirant@gmail.com", selectedGoal)
            updateProfileCard()
            dialog.dismiss()
            Toast.makeText(this, if (isHindi) "Google से सफलतापूर्वक साइन इन किया गया!" else "Signed in with Google! Cloud sync active.", Toast.LENGTH_SHORT).show()
        }

        dialogBinding.btnAuthPhone.setOnClickListener {
            val name = dialogBinding.etAuthName.text.toString().trim()
            val selectedGoal = getSelectedGoalFromChips(dialogBinding)
            authManager.signInWithPhone("+91 98765 43210", if (name.isNotEmpty()) name else "Aspirant", selectedGoal)
            updateProfileCard()
            dialog.dismiss()
            Toast.makeText(this, if (isHindi) "मोबाइल ओटीपी द्वारा सत्यापित!" else "Verified via Mobile OTP! All-India ranking active.", Toast.LENGTH_SHORT).show()
        }

        dialogBinding.btnAuthGuest.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun getSelectedGoalFromChips(dialogBinding: DialogAuthBottomSheetBinding): String {
        return when {
            dialogBinding.chipGoalJee.isChecked -> "JEE Main & Advanced"
            dialogBinding.chipGoalCbse10.isChecked -> "CBSE Class 10"
            dialogBinding.chipGoalCbse12.isChecked -> "CBSE Class 12"
            dialogBinding.chipGoalRbse10.isChecked -> "RBSE Class 10"
            dialogBinding.chipGoalRbse12.isChecked -> "RBSE Class 12"
            dialogBinding.chipGoalSchool.isChecked -> "School (Class 1-9)"
            dialogBinding.chipGoalCompetitive.isChecked -> "UPSC / SSC / Govt"
            else -> "Daily GK & General"
        }
    }

    private fun loadCurrentPreferences() {
        // Theme
        when (prefs.selectedTheme) {
            ThemeManager.THEME_TECHNICAL -> binding.chipThemeTechnical.isChecked = true
            ThemeManager.THEME_GK -> binding.chipThemeGK.isChecked = true
            ThemeManager.THEME_HOMEMAKER -> binding.chipThemeHomemaker.isChecked = true
            ThemeManager.THEME_MIXED -> binding.chipThemeMixed.isChecked = true
            ThemeManager.THEME_DARK -> binding.chipThemeDark.isChecked = true
            else -> binding.chipThemeAcademic.isChecked = true
        }

        // Language
        if (prefs.selectedLanguage == "hi") {
            binding.rbSetLangHindi.isChecked = true
        } else {
            binding.rbSetLangEnglish.isChecked = true
        }

        // Auto TTS
        binding.switchAutoTts.isChecked = prefs.isAutoTtsEnabled

        // Negative Marking
        binding.switchNegativeMarking.isChecked = prefs.isNegativeMarkingEnabled

        // Timer
        when (prefs.perQuestionTimerSeconds) {
            30 -> binding.chipTimer30.isChecked = true
            60 -> binding.chipTimer60.isChecked = true
            90 -> binding.chipTimer90.isChecked = true
            else -> binding.chipTimer45.isChecked = true
        }
    }

    private fun setupListeners() {
        // Theme selection
        binding.chipGroupThemes.setOnCheckedStateChangeListener { _, checkedIds ->
            val newTheme = when {
                binding.chipThemeTechnical.isChecked -> ThemeManager.THEME_TECHNICAL
                binding.chipThemeGK.isChecked -> ThemeManager.THEME_GK
                binding.chipThemeHomemaker.isChecked -> ThemeManager.THEME_HOMEMAKER
                binding.chipThemeMixed.isChecked -> ThemeManager.THEME_MIXED
                binding.chipThemeDark.isChecked -> ThemeManager.THEME_DARK
                else -> ThemeManager.THEME_ACADEMIC
            }
            if (newTheme != prefs.selectedTheme) {
                prefs.selectedTheme = newTheme
                recreateActivity()
            }
        }

        // Language selection
        binding.rgSettingsLanguage.setOnCheckedChangeListener { _, checkedId ->
            val newLang = if (checkedId == binding.rbSetLangHindi.id) "hi" else "en"
            if (newLang != prefs.selectedLanguage) {
                prefs.selectedLanguage = newLang
                restartApp()
            }
        }

        // Auto TTS
        binding.switchAutoTts.setOnCheckedChangeListener { _, isChecked ->
            prefs.isAutoTtsEnabled = isChecked
        }

        // Negative Marking
        binding.switchNegativeMarking.setOnCheckedChangeListener { _, isChecked ->
            prefs.isNegativeMarkingEnabled = isChecked
        }

        // Timer selection
        binding.chipGroupTimer.setOnCheckedStateChangeListener { _, _ ->
            val seconds = when {
                binding.chipTimer30.isChecked -> 30
                binding.chipTimer60.isChecked -> 60
                binding.chipTimer90.isChecked -> 90
                else -> 45
            }
            prefs.perQuestionTimerSeconds = seconds
        }

        // Reset progress
        binding.btnResetProgress.setOnClickListener {
            showResetConfirmDialog()
        }

        // Authentication & Profile Actions
        binding.btnAuthAction.setOnClickListener {
            if (authManager.isLoggedIn()) {
                val isHindi = prefs.selectedLanguage == "hi"
                MaterialAlertDialogBuilder(this)
                    .setTitle(if (isHindi) "साइन आउट करें?" else "Sign Out?")
                    .setMessage(if (isHindi) "क्या आप वाकई साइन आउट करना चाहते हैं? आपका स्थानीय अभ्यास डेटा सुरक्षित रहेगा।" else "Are you sure you want to sign out? Your local practice data will remain safe.")
                    .setPositiveButton(if (isHindi) "साइन आउट" else "Sign Out") { _, _ ->
                        authManager.signOut()
                        updateProfileCard()
                        Toast.makeText(this, if (isHindi) "सफलतापूर्वक साइन आउट किया गया" else "Signed out successfully", Toast.LENGTH_SHORT).show()
                    }
                    .setNegativeButton(if (isHindi) "रद्द करें" else "Cancel", null)
                    .show()
            } else {
                showAuthDialog()
            }
        }

        binding.btnEditProfile.setOnClickListener {
            showAuthDialog()
        }
    }

    private fun showResetConfirmDialog() {
        MaterialAlertDialogBuilder(this)
            .setTitle("Reset All Progress?")
            .setMessage("This will clear all your test history and statistics. Bookmarks and preferences will remain intact.")
            .setPositiveButton("Reset") { _, _ ->
                lifecycleScope.launch {
                    val repo = (application as IndiaQuizApp).quizRepository
                    withContext(Dispatchers.IO) {
                        repo.clearHistory()
                    }
                    MaterialAlertDialogBuilder(this@SettingsActivity)
                        .setMessage("Progress has been reset successfully.")
                        .setPositiveButton("OK", null)
                        .show()
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun recreateActivity() {
        val intent = intent
        finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        startActivity(intent)
    }

    private fun restartApp() {
        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivity(intent)
        finish()
    }
}
