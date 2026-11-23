package com.indiaquiz.app.ui.analytics

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.databinding.ActivityAnalyticsBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.result.ResultActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.util.Locale

class AnalyticsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnalyticsBinding
    private lateinit var prefs: PreferenceHelper
    private lateinit var historyAdapter: HistoryAdapter

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivityAnalyticsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarAnalytics.applyStatusBarPadding()

        setupToolbar()
        setupRecyclerView()
        loadAnalyticsData()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarAnalytics)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarAnalytics.setNavigationOnClickListener {
            finish()
        }
    }

    private fun setupRecyclerView() {
        historyAdapter = HistoryAdapter { attempt ->
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("EXTRA_ATTEMPT_ID", attempt.id)
            }
            startActivity(intent)
        }
        binding.rvQuizHistory.layoutManager = LinearLayoutManager(this)
        binding.rvQuizHistory.adapter = historyAdapter
    }

    private fun loadAnalyticsData() {
        val repository = (application as IndiaQuizApp).quizRepository

        lifecycleScope.launch {
            val overview = repository.getAnalyticsOverview()
            binding.tvStatTotalTests.text = overview.totalAttempts.toString()
            binding.tvStatTotalQuestions.text = overview.totalQuestionsAnswered.toString()
            binding.tvStatAvgAccuracy.text = String.format(Locale.getDefault(), "%.1f%%", overview.averageAccuracy)
            binding.tvStatBestScore.text = String.format(Locale.getDefault(), "%.1f", overview.bestScore)

            repository.allAttemptsFlow.collectLatest { attempts ->
                historyAdapter.submitList(attempts)
                binding.tvEmptyHistory.visibility = if (attempts.isEmpty()) View.VISIBLE else View.GONE
                binding.rvQuizHistory.visibility = if (attempts.isNotEmpty()) View.VISIBLE else View.GONE
            }
        }
    }
}
