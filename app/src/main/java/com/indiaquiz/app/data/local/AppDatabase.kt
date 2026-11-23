package com.indiaquiz.app.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizAttempt
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Question::class, QuizAttempt::class], version = 7, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun questionDao(): QuestionDao
    abstract fun quizAttemptDao(): QuizAttemptDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "india_quiz_database"
                )
                .fallbackToDestructiveMigration(dropAllTables = true)
                .addCallback(AppDatabaseCallback(scope))
                .build()
                INSTANCE = instance
                instance
            }
        }

        private class AppDatabaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateInitialQuestions(database.questionDao())
                    }
                }
            }

            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                // Check if empty in case onCreate wasn't completed
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        if (database.questionDao().getQuestionCount() == 0) {
                            populateInitialQuestions(database.questionDao())
                        }
                    }
                }
            }

            private suspend fun populateInitialQuestions(dao: QuestionDao) {
                val questions = PrepopulateData.getQuestions()
                dao.insertAll(questions)
            }
        }
    }
}
