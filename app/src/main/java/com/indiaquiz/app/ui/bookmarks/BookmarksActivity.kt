package com.indiaquiz.app.ui.bookmarks

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.audio.AudioQuestionReader
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.databinding.ActivityBookmarksBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.quiz.QuizActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class BookmarksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookmarksBinding
    private lateinit var prefs: PreferenceHelper
    private lateinit var bookmarksAdapter: BookmarksAdapter
    private var audioReader: AudioQuestionReader? = null
    private var currentBookmarkedQuestions: List<Question> = emptyList()

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivityBookmarksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarBookmarks.applyStatusBarPadding()

        setupToolbar()
        setupAudio()
        setupRecyclerView()
        observeBookmarks()

        binding.btnPracticeSaved.setOnClickListener {
            launchBookmarksQuiz()
        }
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarBookmarks)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarBookmarks.setNavigationOnClickListener {
            finish()
        }
    }

    private fun setupAudio() {
        audioReader = AudioQuestionReader(this)
        audioReader?.setSpeechRate(prefs.ttsSpeechRate)
    }

    private fun setupRecyclerView() {
        val isHindi = prefs.selectedLanguage == "hi"
        bookmarksAdapter = BookmarksAdapter(
            isHindi = isHindi,
            onTtsClicked = { text ->
                audioReader?.speak(text)
            },
            onRemoveBookmarkClicked = { question ->
                removeBookmark(question)
            }
        )
        binding.rvBookmarksList.layoutManager = LinearLayoutManager(this)
        binding.rvBookmarksList.adapter = bookmarksAdapter
    }

    private fun observeBookmarks() {
        val repository = (application as IndiaQuizApp).questionRepository
        lifecycleScope.launch {
            repository.allBookmarkedQuestions.collectLatest { questions ->
                currentBookmarkedQuestions = questions
                bookmarksAdapter.submitList(questions)

                val count = questions.size
                binding.tvBookmarksCount.text = "Saved Questions ($count)"
                binding.btnPracticeSaved.isEnabled = count > 0

                binding.tvEmptyBookmarks.visibility = if (count == 0) View.VISIBLE else View.GONE
                binding.rvBookmarksList.visibility = if (count > 0) View.VISIBLE else View.GONE
            }
        }
    }

    private fun removeBookmark(question: Question) {
        val repository = (application as IndiaQuizApp).questionRepository
        lifecycleScope.launch {
            repository.toggleBookmark(question.id, false)
        }
    }

    private fun launchBookmarksQuiz() {
        if (currentBookmarkedQuestions.isEmpty()) return

        val config = QuizConfig(
            title = if (prefs.selectedLanguage == "hi") "सहेजे गए प्रश्नों का अभ्यास" else "Practice Saved Questions",
            category = "BOOKMARKS",
            mode = "PRACTICE",
            questionCount = currentBookmarkedQuestions.size,
            specificQuestionIds = currentBookmarkedQuestions.map { it.id }
        )
        val intent = Intent(this, QuizActivity::class.java).apply {
            putExtra("EXTRA_QUIZ_CONFIG", config)
        }
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        audioReader?.shutdown()
        audioReader = null
    }
}
