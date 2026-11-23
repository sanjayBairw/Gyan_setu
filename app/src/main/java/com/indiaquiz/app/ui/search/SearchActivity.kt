package com.indiaquiz.app.ui.search

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.databinding.ActivitySearchBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.quiz.QuizActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    private lateinit var prefs: PreferenceHelper
    private lateinit var searchAdapter: SearchAdapter
    private var searchJob: Job? = null
    private var allSearchResults: List<Question> = emptyList()

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarSearch.applyStatusBarPadding()

        setupToolbar()
        setupRecyclerView()
        setupSearchInput()
        setupFilterChips()

        // Initial search to display popular topics
        executeSearch("")
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarSearch)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarSearch.setNavigationOnClickListener {
            finish()
        }
    }

    private fun setupRecyclerView() {
        val isHindi = prefs.selectedLanguage == "hi"
        searchAdapter = SearchAdapter(isHindi) { question ->
            launchQuizForQuestion(question)
        }
        binding.rvSearchResults.layoutManager = LinearLayoutManager(this)
        binding.rvSearchResults.adapter = searchAdapter
    }

    private fun setupSearchInput() {
        binding.etSearchInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                searchJob?.cancel()
                searchJob = lifecycleScope.launch {
                    delay(300) // Debounce
                    executeSearch(s?.toString().orEmpty())
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun setupFilterChips() {
        binding.chipGroupSearchFilter.setOnCheckedStateChangeListener { _, checkedIds ->
            filterResults()
        }
    }

    private fun executeSearch(query: String) {
        lifecycleScope.launch {
            val repository = (application as IndiaQuizApp).questionRepository
            allSearchResults = if (query.isBlank()) {
                repository.getMixedRandomQuestions(15)
            } else {
                repository.search(query)
            }
            filterResults()
        }
    }

    private fun filterResults() {
        val checkedId = binding.chipGroupSearchFilter.checkedChipId
        val filtered = when (checkedId) {
            binding.chipExams.id -> allSearchResults.filter { it.category == "COMPETITIVE_EXAMS" }
            binding.chipSchool.id -> allSearchResults.filter { it.category == "SCHOOL_EDUCATION" }
            binding.chipTechnical.id -> allSearchResults.filter { it.category == "ITI_TECHNICAL" }
            binding.chipHindi.id -> allSearchResults.filter { it.category == "HINDI_LANGUAGE" || it.category == "ENGLISH_LANGUAGE" }
            else -> allSearchResults
        }

        searchAdapter.submitList(filtered)
        binding.tvEmptySearch.visibility = if (filtered.isEmpty()) View.VISIBLE else View.GONE
    }

    private fun launchQuizForQuestion(question: Question) {
        val config = QuizConfig(
            title = question.chapterOrTopic,
            category = question.category,
            subcategory = question.subcategory,
            chapterOrTopic = question.chapterOrTopic,
            mode = "PRACTICE",
            questionCount = 5,
            difficulty = "ALL",
            specificQuestionIds = listOf(question.id)
        )
        val intent = Intent(this, QuizActivity::class.java).apply {
            putExtra("EXTRA_QUIZ_CONFIG", config)
        }
        startActivity(intent)
    }
}
