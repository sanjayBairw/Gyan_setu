package com.indiaquiz.app.ui.result

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.R
import com.indiaquiz.app.data.model.AttemptQuestionRecord
import com.indiaquiz.app.data.model.QuizAttempt
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.databinding.ActivityResultBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.main.MainActivity
import com.indiaquiz.app.ui.quiz.QuizActivity
import com.indiaquiz.app.ui.review.ReviewAnswersActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Locale

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private lateinit var prefs: PreferenceHelper
    private var attemptId: Long = -1L
    private var currentAttempt: QuizAttempt? = null

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarResult.applyStatusBarPadding()

        attemptId = intent.getLongExtra("EXTRA_ATTEMPT_ID", -1L)
        loadAttemptData()

        // Update daily streak upon completing a quiz
        prefs.updateDailyStreak()
    }

    private fun loadAttemptData() {
        lifecycleScope.launch {
            val repository = (application as IndiaQuizApp).quizRepository
            val attempt = withContext(Dispatchers.IO) {
                repository.getAttemptById(attemptId)
            }
            if (attempt != null) {
                currentAttempt = attempt
                displayResults(attempt)
            }
        }
    }

    private fun displayResults(attempt: QuizAttempt) {
        val isHindi = prefs.selectedLanguage == "hi"

        // Score & accuracy
        binding.tvResultScore.text = String.format(Locale.getDefault(), "Score: %.1f / %.0f", attempt.score, attempt.maxScore)
        binding.tvResultAccuracy.text = String.format(Locale.getDefault(), "Accuracy: %.1f%%", attempt.accuracyPercentage)

        if (attempt.accuracyPercentage >= 70f) {
            binding.tvCongratsMessage.text = getString(R.string.result_congrats)
            binding.ivResultTrophy.setImageResource(R.drawable.ic_trophy)
        } else {
            binding.tvCongratsMessage.text = getString(R.string.result_good)
        }

        // Breakdown counters
        binding.tvCorrectCount.text = attempt.correctCount.toString()
        binding.tvWrongCount.text = attempt.wrongCount.toString()
        binding.tvSkippedCount.text = attempt.skippedCount.toString()

        // Time calculations
        val totalSec = attempt.timeTakenSeconds
        val mins = totalSec / 60
        val secs = totalSec % 60
        binding.tvTimeTaken.text = String.format(Locale.getDefault(), "%02dm %02ds", mins, secs)

        // Actions
        binding.btnReviewAnswers.setOnClickListener {
            val intent = Intent(this, ReviewAnswersActivity::class.java).apply {
                putExtra("EXTRA_ATTEMPT_ID", attempt.id)
            }
            startActivity(intent)
        }

        // Retry missed questions
        val recordsType = object : TypeToken<List<AttemptQuestionRecord>>() {}.type
        val records: List<AttemptQuestionRecord> = try {
            Gson().fromJson(attempt.detailsJson, recordsType) ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
        val incorrectIds = records.filter { !it.isCorrect && it.selectedOptionIndex != -1 }.map { it.questionId }

        if (incorrectIds.isNotEmpty()) {
            binding.btnPracticeMissed.visibility = View.VISIBLE
            binding.btnPracticeMissed.setOnClickListener {
                val missedConfig = QuizConfig(
                    title = if (isHindi) "गलत प्रश्नों का अभ्यास" else "Practice Missed Questions",
                    category = attempt.category,
                    mode = "PRACTICE",
                    questionCount = incorrectIds.size,
                    specificQuestionIds = incorrectIds
                )
                val intent = Intent(this, QuizActivity::class.java).apply {
                    putExtra("EXTRA_QUIZ_CONFIG", missedConfig)
                }
                startActivity(intent)
                finish()
            }
        } else {
            binding.btnPracticeMissed.visibility = View.GONE
        }

        binding.btnRetakeQuiz.setOnClickListener {
            val retryConfig = QuizConfig(
                title = attempt.quizTitle,
                category = attempt.category,
                mode = attempt.quizMode,
                questionCount = attempt.totalQuestions
            )
            val intent = Intent(this, QuizActivity::class.java).apply {
                putExtra("EXTRA_QUIZ_CONFIG", retryConfig)
            }
            startActivity(intent)
            finish()
        }

        binding.btnShareResult.setOnClickListener {
            shareScore(attempt)
        }

        binding.btnHomeFromResults.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
            finish()
        }
    }

    private fun shareScore(attempt: QuizAttempt) {
        val shareBody = getString(
            R.string.share_text,
            attempt.score,
            attempt.quizTitle,
            attempt.accuracyPercentage
        )
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "My GyanSetu Quiz Score")
            putExtra(Intent.EXTRA_TEXT, shareBody)
        }
        startActivity(Intent.createChooser(shareIntent, "Share Result Via"))
    }
}
