package com.indiaquiz.app.ui.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.indiaquiz.app.databinding.ActivitySplashBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.main.MainActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private lateinit var prefs: PreferenceHelper

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = PreferenceHelper(this)
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (prefs.isFirstRunCompleted) {
            startMainActivity()
            return
        }

        // Language selection radio group
        if (prefs.selectedLanguage == "hi") {
            binding.rbHindi.isChecked = true
        } else {
            binding.rbEnglish.isChecked = true
        }

        binding.rgLanguage.setOnCheckedChangeListener { _, checkedId ->
            val lang = if (checkedId == binding.rbHindi.id) "hi" else "en"
            prefs.selectedLanguage = lang
        }

        binding.btnGetStarted.setOnClickListener {
            prefs.isFirstRunCompleted = true
            startMainActivity()
        }
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
