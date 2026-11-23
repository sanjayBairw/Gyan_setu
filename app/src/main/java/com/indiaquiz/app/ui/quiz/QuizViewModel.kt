package com.indiaquiz.app.ui.quiz

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizAttempt
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.data.model.UserAnswer
import com.indiaquiz.app.engine.QuizEngine
import com.indiaquiz.app.engine.QuizState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class QuizViewModel(application: Application) : AndroidViewModel(application) {

    private val questionRepository = (application as IndiaQuizApp).questionRepository
    private val quizRepository = (application as IndiaQuizApp).quizRepository

    private var engine: QuizEngine? = null
    lateinit var config: QuizConfig

    private val _quizState = MutableLiveData<QuizState>()
    val quizState: LiveData<QuizState> = _quizState

    private val _isLoading = MutableLiveData<Boolean>(true)
    val isLoading: LiveData<Boolean> = _isLoading

    private val _testSubmitted = MutableLiveData<Long?>()
    val testSubmitted: LiveData<Long?> = _testSubmitted

    private val _isBookmarked = MutableLiveData<Boolean>(false)
    val isBookmarked: LiveData<Boolean> = _isBookmarked

    fun initialize(quizConfig: QuizConfig) {
        config = quizConfig
        viewModelScope.launch {
            _isLoading.value = true
            val questions = withContext(Dispatchers.IO) {
                questionRepository.getQuestionsForQuiz(config)
            }
            if (questions.isNotEmpty()) {
                val newEngine = QuizEngine(questions, config)
                engine = newEngine
                updateState()
            }
            _isLoading.value = false
        }
    }

    private fun updateState(remainingSeconds: Int = 0) {
        val eng = engine ?: return
        val currentQ = eng.getCurrentQuestion()
        _isBookmarked.value = currentQ?.isBookmarked ?: false
        _quizState.value = eng.buildCurrentState(remainingSeconds)
    }

    fun selectOption(optionIndex: Int) {
        engine?.selectOption(optionIndex)
        updateState()
    }

    fun clearAnswer() {
        engine?.clearAnswer()
        updateState()
    }

    fun toggleMarkForReview(): Boolean {
        val marked = engine?.toggleMarkForReview() ?: false
        updateState()
        return marked
    }

    fun next(): Boolean {
        val hasNext = engine?.next() ?: false
        if (hasNext) updateState()
        return hasNext
    }

    fun previous(): Boolean {
        val hasPrev = engine?.previous() ?: false
        if (hasPrev) updateState()
        return hasPrev
    }

    fun jumpTo(index: Int): Boolean {
        val jumped = engine?.jumpTo(index) ?: false
        if (jumped) updateState()
        return jumped
    }

    fun toggleBookmark() {
        val currentQ = engine?.getCurrentQuestion() ?: return
        val newBookmarkState = !currentQ.isBookmarked
        currentQ.isBookmarked = newBookmarkState
        _isBookmarked.value = newBookmarkState

        viewModelScope.launch(Dispatchers.IO) {
            questionRepository.toggleBookmark(currentQ.id, newBookmarkState)
        }
    }

    fun getAllAnswersList(): List<UserAnswer> {
        val eng = engine ?: return emptyList()
        return eng.questions.map { q ->
            eng.getAllUserAnswers()[q.id] ?: UserAnswer(questionId = q.id)
        }
    }

    fun submitTest(elapsedSeconds: Long) {
        val eng = engine ?: return
        viewModelScope.launch {
            val (attempt, records) = eng.evaluateResult(elapsedSeconds)
            val attemptId = withContext(Dispatchers.IO) {
                questionRepository.recordQuestionStats(records)
                quizRepository.saveAttempt(attempt)
            }
            _testSubmitted.value = attemptId
        }
    }

    fun endQuiz() {
        engine = null
        _quizState.value = QuizState()
    }
}
