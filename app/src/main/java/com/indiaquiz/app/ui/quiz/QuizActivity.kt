package com.indiaquiz.app.ui.quiz

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.R
import com.indiaquiz.app.audio.AudioQuestionReader
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.databinding.ActivityQuizBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.result.ResultActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyNavigationBarPadding
import com.indiaquiz.app.util.applyStatusBarPadding

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    private lateinit var prefs: PreferenceHelper
    private val viewModel: QuizViewModel by viewModels()

    private var audioReader: AudioQuestionReader? = null
    private lateinit var optionsAdapter: OptionsAdapter
    private var quizConfig: QuizConfig? = null

    private var countDownTimer: CountDownTimer? = null
    private var timerSecondsRemaining: Int = 45
    private var isTimerRunning = false
    private var totalElapsedSeconds: Long = 0L
    private var timerStartTimeMillis: Long = 0L

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        quizConfig = IntentCompat.getSerializableExtra(intent, "EXTRA_QUIZ_CONFIG", QuizConfig::class.java)
        ThemeManager.applyTheme(this, quizConfig?.category)
        super.onCreate(savedInstanceState)

        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Prevent top bar and bottom navigation controls from hiding behind system bars
        binding.toolbarQuiz.applyStatusBarPadding()
        binding.bottomNavBar.applyNavigationBarPadding()

        val config = quizConfig ?: QuizConfig()
        setupAudioReader()
        setupToolbar(config)
        setupRecyclerView(config)
        setupControls(config)
        setupBackPressHandler()

        timerStartTimeMillis = System.currentTimeMillis()
        viewModel.initialize(config)
        observeViewModel()
    }

    private fun setupToolbar(config: QuizConfig) {
        binding.tvQuizTitle.text = config.title
        val catText = config.category ?: "General"
        val modeText = if (config.mode == "PRACTICE") "Practice Mode" else "Exam Mode"
        val badgeParts = mutableListOf<String>()
        if (!config.examOrBoard.isNullOrEmpty()) {
            badgeParts.add(config.examOrBoard)
        } else {
            badgeParts.add(catText)
        }
        if (!config.targetClass.isNullOrEmpty()) badgeParts.add(config.targetClass)
        if (!config.subject.isNullOrEmpty()) badgeParts.add(config.subject)
        badgeParts.add(modeText)
        binding.tvQuizBadge.text = badgeParts.joinToString(" • ")

        binding.toolbarQuiz.setNavigationOnClickListener {
            endQuizAndExit()
        }

        binding.ivBookmark.setOnClickListener {
            viewModel.toggleBookmark()
        }

        binding.ivQuestionPalette.setOnClickListener {
            showQuestionPalette()
        }

        binding.ivTtsSpeak.setOnClickListener {
            toggleAudioPlayback()
        }
    }

    private fun setupAudioReader() {
        audioReader = AudioQuestionReader(this)
        audioReader?.setSpeechRate(prefs.ttsSpeechRate)
        audioReader?.onSpeechStateChanged = { isSpeaking ->
            runOnUiThread {
                if (isSpeaking) {
                    binding.ivTtsSpeak.setImageResource(R.drawable.ic_volume_up)
                    binding.ivTtsSpeak.setColorFilter(Color.parseColor("#FDE047"))
                } else {
                    binding.ivTtsSpeak.setImageResource(R.drawable.ic_volume_up)
                    binding.ivTtsSpeak.setColorFilter(Color.WHITE)
                }
            }
        }
    }

    private fun toggleAudioPlayback() {
        val currentQ = viewModel.quizState.value?.currentQuestion ?: return
        if (audioReader?.isCurrentlySpeaking() == true) {
            audioReader?.stop()
        } else {
            speakCurrentQuestion(currentQ)
        }
    }

    private fun speakCurrentQuestion(question: Question) {
        val isHindi = prefs.selectedLanguage == "hi"
        val qText = if (isHindi && !question.questionTextHindi.isNullOrBlank()) {
            question.questionTextHindi
        } else {
            question.questionText
        }

        val options = if (isHindi && !question.optionsHindi.isNullOrEmpty()) {
            question.optionsHindi
        } else {
            question.options
        }

        audioReader?.readQuestionWithOptions(qText, options)
    }

    private fun setupRecyclerView(config: QuizConfig) {
        val isPractice = config.mode == "PRACTICE"
        optionsAdapter = OptionsAdapter { selectedOptionIndex ->
            viewModel.selectOption(selectedOptionIndex)
            if (isPractice) {
                // Practice mode: answer chosen, reveal explanation
                binding.cardExplanation.visibility = View.VISIBLE
            }
        }
        binding.rvOptions.layoutManager = LinearLayoutManager(this)
        binding.rvOptions.adapter = optionsAdapter
    }

    private fun setupControls(config: QuizConfig) {
        binding.btnPrevious.setOnClickListener {
            if (viewModel.previous()) {
                resetPerQuestionTimer()
            }
        }

        binding.btnClearAnswer.setOnClickListener {
            viewModel.clearAnswer()
        }

        binding.btnMarkReview.setOnClickListener {
            val isMarked = viewModel.toggleMarkForReview()
            updateReviewButton(isMarked)
        }

        binding.btnNextOrSubmit.setOnClickListener {
            val state = viewModel.quizState.value ?: return@setOnClickListener
            if (state.isLastQuestion) {
                showSubmitConfirmDialog()
            } else {
                if (viewModel.next()) {
                    resetPerQuestionTimer()
                }
            }
        }
    }

    private fun updateReviewButton(isMarked: Boolean) {
        if (isMarked) {
            binding.btnMarkReview.text = getString(R.string.btn_marked)
            binding.btnMarkReview.strokeColor = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.warning_orange))
            binding.btnMarkReview.setTextColor(ContextCompat.getColor(this, R.color.warning_orange))
            binding.tvMarkedBadge.visibility = View.VISIBLE
        } else {
            binding.btnMarkReview.text = getString(R.string.btn_mark_review)
            binding.btnMarkReview.strokeColor = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.review_purple))
            binding.btnMarkReview.setTextColor(ContextCompat.getColor(this, R.color.review_purple))
            binding.tvMarkedBadge.visibility = View.GONE
        }
    }

    private fun observeViewModel() {
        viewModel.isLoading.observe(this) { isLoading ->
            binding.loadingQuiz.visibility = if (isLoading) View.VISIBLE else View.GONE
            binding.scrollViewQuiz.visibility = if (isLoading) View.INVISIBLE else View.VISIBLE
        }

        viewModel.isBookmarked.observe(this) { isBookmarked ->
            if (isBookmarked) {
                binding.ivBookmark.setImageResource(R.drawable.ic_bookmark)
                binding.ivBookmark.setColorFilter(Color.parseColor("#F59E0B"))
            } else {
                binding.ivBookmark.setImageResource(R.drawable.ic_bookmark_border)
                binding.ivBookmark.setColorFilter(Color.WHITE)
            }
        }

        viewModel.quizState.observe(this) { state ->
            val currentQ = state.currentQuestion ?: return@observe
            displayQuestion(currentQ, state)
        }

        viewModel.testSubmitted.observe(this) { attemptId ->
            if (attemptId != null && attemptId > 0) {
                cancelTimer()
                audioReader?.stop()
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("EXTRA_ATTEMPT_ID", attemptId)
                }
                startActivity(intent)
                finish()
            }
        }
    }

    private fun displayQuestion(question: Question, state: com.indiaquiz.app.engine.QuizState) {
        val isHindi = prefs.selectedLanguage == "hi"

        // Counter
        val currentNum = state.currentIndex + 1
        val total = state.totalQuestions
        binding.tvQuestionCounter.text = getString(R.string.question_counter, currentNum, total)

        // Progress
        val progressPercent = ((currentNum.toFloat() / total.toFloat()) * 100).toInt()
        binding.progressBarQuiz.progress = progressPercent

        // Difficulty tag
        binding.tvQuestionDifficulty.text = question.difficulty

        // Question text
        val text = if (isHindi && !question.questionTextHindi.isNullOrBlank()) {
            question.questionTextHindi
        } else {
            question.questionText
        }
        binding.tvQuestionContent.text = text

        // Options
        val optionsList = if (isHindi && !question.optionsHindi.isNullOrEmpty()) {
            question.optionsHindi
        } else {
            question.options
        }

        val userAns = state.currentUserAnswer
        val chosenIndex = userAns?.selectedOptionIndex ?: -1
        val isPractice = viewModel.config.mode == "PRACTICE"

        optionsAdapter.setOptions(
            newOptions = optionsList,
            userSelectedIndex = chosenIndex,
            actualCorrectIndex = question.correctAnswerIndex,
            practiceMode = isPractice
        )

        // Explanation (only visible in Practice mode after answering)
        if (isPractice && chosenIndex != -1) {
            binding.cardExplanation.visibility = View.VISIBLE
            val expl = if (isHindi && !question.explanationHindi.isNullOrBlank()) {
                question.explanationHindi
            } else {
                question.explanation
            }
            binding.tvExplanationContent.text = expl
        } else {
            binding.cardExplanation.visibility = View.GONE
        }

        // Navigation button states
        binding.btnPrevious.isEnabled = !state.isFirstQuestion
        if (state.isLastQuestion) {
            binding.btnNextOrSubmit.text = getString(R.string.btn_submit_quiz)
        } else {
            binding.btnNextOrSubmit.text = getString(R.string.btn_next)
        }

        // Review state
        updateReviewButton(userAns?.isMarkedForReview == true)

        // Timer reset for this question
        startOrResetTimer()

        // Auto TTS if user preference is enabled
        if (prefs.isAutoTtsEnabled) {
            speakCurrentQuestion(question)
        }
    }

    private fun startOrResetTimer() {
        if (viewModel.config.mode == "PRACTICE") {
            binding.layoutTimer.visibility = View.GONE
            return
        }

        binding.layoutTimer.visibility = View.VISIBLE
        cancelTimer()
        timerSecondsRemaining = viewModel.config.timePerQuestionSeconds

        countDownTimer = object : CountDownTimer((timerSecondsRemaining * 1000).toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timerSecondsRemaining = (millisUntilFinished / 1000).toInt()
                val minutes = timerSecondsRemaining / 60
                val seconds = timerSecondsRemaining % 60
                binding.tvTimerCountdown.text = String.format("%02d:%02d", minutes, seconds)

                // Warning indicator when time < 10s
                if (timerSecondsRemaining <= 10) {
                    binding.layoutTimer.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#FEE2E2"))
                    binding.tvTimerCountdown.setTextColor(Color.parseColor("#EF4444"))
                    binding.ivTimerIcon.setColorFilter(Color.parseColor("#EF4444"))
                } else {
                    binding.layoutTimer.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#FEF3C7"))
                    binding.tvTimerCountdown.setTextColor(Color.parseColor("#B45309"))
                    binding.ivTimerIcon.setColorFilter(Color.parseColor("#F59E0B"))
                }
            }

            override fun onFinish() {
                // Time up! Auto-next or submit
                val state = viewModel.quizState.value ?: return
                if (state.isLastQuestion) {
                    submitFinalTest()
                } else {
                    Toast.makeText(this@QuizActivity, "Time up for this question!", Toast.LENGTH_SHORT).show()
                    viewModel.next()
                }
            }
        }.start()
        isTimerRunning = true
    }

    private fun resetPerQuestionTimer() {
        cancelTimer()
        startOrResetTimer()
    }

    private fun cancelTimer() {
        countDownTimer?.cancel()
        countDownTimer = null
        isTimerRunning = false
    }

    private fun showQuestionPalette() {
        val total = viewModel.quizState.value?.totalQuestions ?: 0
        val answers = viewModel.getAllAnswersList()
        val currentIdx = viewModel.quizState.value?.currentIndex ?: 0

        val bottomSheet = QuestionPaletteBottomSheet(
            totalQuestions = total,
            answers = answers,
            currentActiveIndex = currentIdx,
            onQuestionSelected = { targetIndex ->
                viewModel.jumpTo(targetIndex)
                resetPerQuestionTimer()
            },
            onSubmitRequested = {
                showSubmitConfirmDialog()
            }
        )
        bottomSheet.show(supportFragmentManager, QuestionPaletteBottomSheet.TAG)
    }

    private fun showSubmitConfirmDialog() {
        val answers = viewModel.getAllAnswersList()
        val total = viewModel.quizState.value?.totalQuestions ?: 0
        val answeredCount = answers.count { it.isAnswered }

        MaterialAlertDialogBuilder(this)
            .setTitle(getString(R.string.confirm_submit_title))
            .setMessage(getString(R.string.confirm_submit_msg, answeredCount, total))
            .setPositiveButton(getString(R.string.btn_submit_quiz)) { _, _ ->
                submitFinalTest()
            }
            .setNegativeButton(getString(R.string.btn_cancel), null)
            .show()
    }

    private fun setupBackPressHandler() {
        onBackPressedDispatcher.addCallback(this, object : androidx.activity.OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                endQuizAndExit()
            }
        })
    }

    private fun endQuizAndExit() {
        cancelTimer()
        audioReader?.stop()
        viewModel.endQuiz()
        Toast.makeText(this, getString(R.string.quiz_ended), Toast.LENGTH_SHORT).show()
        finish()
    }

    private fun submitFinalTest() {
        cancelTimer()
        audioReader?.stop()
        val elapsed = (System.currentTimeMillis() - timerStartTimeMillis) / 1000
        viewModel.submitTest(elapsed)
    }

    override fun onPause() {
        super.onPause()
        cancelTimer()
        audioReader?.stop()
    }

    override fun onResume() {
        super.onResume()
        if (!isTimerRunning && viewModel.config.mode != "PRACTICE" && viewModel.quizState.value?.currentQuestion != null) {
            startOrResetTimer()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        cancelTimer()
        audioReader?.shutdown()
        audioReader = null
        viewModel.endQuiz()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        endQuizAndExit()
    }
}
