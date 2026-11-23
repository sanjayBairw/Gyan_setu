package com.indiaquiz.app

import android.app.Application
import com.indiaquiz.app.data.local.AppDatabase
import com.indiaquiz.app.data.repository.QuestionRepository
import com.indiaquiz.app.data.repository.QuizRepository
import com.indiaquiz.app.util.PreferenceHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class IndiaQuizApp : Application() {

    private val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { AppDatabase.getDatabase(this, applicationScope) }
    val questionRepository by lazy { QuestionRepository(database.questionDao()) }
    val quizRepository by lazy { QuizRepository(database.quizAttemptDao()) }
    val preferenceHelper by lazy { PreferenceHelper(this) }
    val authManager by lazy { com.indiaquiz.app.util.AuthManager(this) }

    override fun onCreate() {
        super.onCreate()
        // Preemptively initialize and warm up Room database on process start
        applicationScope.launch(Dispatchers.IO) {
            try {
                if (database.questionDao().getQuestionCount() == 0) {
                    database.questionDao().insertAll(com.indiaquiz.app.data.local.PrepopulateData.getQuestions())
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
