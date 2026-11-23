package com.indiaquiz.app.ui.review

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.audio.AudioQuestionReader
import com.indiaquiz.app.data.model.AttemptQuestionRecord
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.databinding.ActivityReviewAnswersBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ReviewAnswersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReviewAnswersBinding
    private lateinit var prefs: PreferenceHelper
    private lateinit var reviewAdapter: ReviewAdapter
    private var audioReader: AudioQuestionReader? = null

    private var allReviewItems: List<Pair<Question, AttemptQuestionRecord>> = emptyList()

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivityReviewAnswersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarReview.applyStatusBarPadding()

        setupToolbar()
        setupAudio()
        setupRecyclerView()
        setupFilterChips()

        val attemptId = intent.getLongExtra("EXTRA_ATTEMPT_ID", -1L)
        loadReviewData(attemptId)
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarReview)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarReview.setNavigationOnClickListener {
            finish()
        }
    }

    private fun setupAudio() {
        audioReader = AudioQuestionReader(this)
        audioReader?.setSpeechRate(prefs.ttsSpeechRate)
    }

    private fun setupRecyclerView() {
        val isHindi = prefs.selectedLanguage == "hi"
        reviewAdapter = ReviewAdapter(isHindi) { textToSpeak ->
            audioReader?.speak(textToSpeak)
        }
        binding.rvReviewList.layoutManager = LinearLayoutManager(this)
        binding.rvReviewList.adapter = reviewAdapter
    }

    private fun setupFilterChips() {
        binding.chipGroupReviewFilter.setOnCheckedStateChangeListener { _, _ ->
            applyFilter()
        }
    }

    private fun loadReviewData(attemptId: Long) {
        lifecycleScope.launch {
            val qRepo = (application as IndiaQuizApp).questionRepository
            val quizRepo = (application as IndiaQuizApp).quizRepository

            val attempt = withContext(Dispatchers.IO) {
                quizRepo.getAttemptById(attemptId)
            } ?: return@launch

            val recordsType = object : TypeToken<List<AttemptQuestionRecord>>() {}.type
            val records: List<AttemptQuestionRecord> = try {
                Gson().fromJson(attempt.detailsJson, recordsType) ?: emptyList()
            } catch (e: Exception) {
                emptyList()
            }

            val questionIds = records.map { it.questionId }
            val questions = withContext(Dispatchers.IO) {
                questionIds.mapNotNull { qRepo.getQuestionById(it) }
            }

            val questionsMap = questions.associateBy { it.id }
            allReviewItems = records.mapNotNull { record ->
                val q = questionsMap[record.questionId]
                if (q != null) Pair(q, record) else null
            }

            // Update chip counts
            val total = allReviewItems.size
            val incorrect = allReviewItems.count { !it.second.isCorrect && it.second.selectedOptionIndex != -1 }
            val correct = allReviewItems.count { it.second.isCorrect }
            val skipped = allReviewItems.count { it.second.selectedOptionIndex == -1 }

            binding.chipReviewAll.text = "All ($total)"
            binding.chipReviewIncorrect.text = "Incorrect ($incorrect)"
            binding.chipReviewCorrect.text = "Correct ($correct)"
            binding.chipReviewSkipped.text = "Skipped ($skipped)"

            applyFilter()
        }
    }

    private fun applyFilter() {
        val filtered = when (binding.chipGroupReviewFilter.checkedChipId) {
            binding.chipReviewIncorrect.id -> allReviewItems.filter { !it.second.isCorrect && it.second.selectedOptionIndex != -1 }
            binding.chipReviewCorrect.id -> allReviewItems.filter { it.second.isCorrect }
            binding.chipReviewSkipped.id -> allReviewItems.filter { it.second.selectedOptionIndex == -1 }
            else -> allReviewItems
        }
        reviewAdapter.submitList(filtered)
    }

    override fun onDestroy() {
        super.onDestroy()
        audioReader?.shutdown()
        audioReader = null
    }
}
