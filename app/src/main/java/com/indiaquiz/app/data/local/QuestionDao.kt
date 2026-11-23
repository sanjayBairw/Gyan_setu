package com.indiaquiz.app.data.local

import androidx.room.*
import com.indiaquiz.app.data.model.Question
import kotlinx.coroutines.flow.Flow

@Dao
interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(questions: List<Question>)

    @Update
    suspend fun update(question: Question)

    @Query("SELECT COUNT(*) FROM questions")
    suspend fun getQuestionCount(): Int

    @Query("SELECT * FROM questions")
    fun getAllQuestionsFlow(): Flow<List<Question>>

    @Query("SELECT * FROM questions")
    suspend fun getAllQuestions(): List<Question>

    @Query("SELECT * FROM questions WHERE id = :id LIMIT 1")
    suspend fun getQuestionById(id: String): Question?

    @Query("SELECT * FROM questions WHERE id IN (:ids)")
    suspend fun getQuestionsByIds(ids: List<String>): List<Question>

    @Query("SELECT * FROM questions WHERE category = :category")
    suspend fun getQuestionsByCategory(category: String): List<Question>

    @Query("SELECT * FROM questions WHERE category = :category AND difficulty = :difficulty")
    suspend fun getQuestionsByCategoryAndDifficulty(category: String, difficulty: String): List<Question>

    @Query("SELECT * FROM questions WHERE subcategory = :subcategory")
    suspend fun getQuestionsBySubcategory(subcategory: String): List<Question>

    @Query("SELECT * FROM questions WHERE examOrBoard = :examOrBoard")
    suspend fun getQuestionsByExamOrBoard(examOrBoard: String): List<Question>

    @Query("SELECT * FROM questions WHERE examOrBoard = :examOrBoard AND targetClass = :targetClass")
    suspend fun getQuestionsByBoardAndClass(examOrBoard: String, targetClass: String): List<Question>

    @Query("SELECT * FROM questions WHERE subject = :subject")
    suspend fun getQuestionsBySubject(subject: String): List<Question>

    @Query("SELECT * FROM questions WHERE chapterOrTopic = :topic")
    suspend fun getQuestionsByTopic(topic: String): List<Question>

    @Query("SELECT * FROM questions WHERE isBookmarked = 1")
    fun getBookmarkedQuestionsFlow(): Flow<List<Question>>

    @Query("SELECT * FROM questions WHERE isBookmarked = 1")
    suspend fun getBookmarkedQuestionsSync(): List<Question>

    @Query("UPDATE questions SET isBookmarked = :isBookmarked WHERE id = :questionId")
    suspend fun updateBookmark(questionId: String, isBookmarked: Boolean)

    @Query("UPDATE questions SET timesAttempted = timesAttempted + 1, timesCorrect = timesCorrect + :correctDelta WHERE id = :questionId")
    suspend fun updateAttemptStats(questionId: String, correctDelta: Int)

    @Query("SELECT * FROM questions WHERE timesAttempted > timesCorrect")
    suspend fun getIncorrectQuestions(): List<Question>

    @Query("""
        SELECT * FROM questions 
        WHERE questionText LIKE '%' || :query || '%' 
           OR questionTextHindi LIKE '%' || :query || '%'
           OR chapterOrTopic LIKE '%' || :query || '%'
           OR subject LIKE '%' || :query || '%'
           OR examOrBoard LIKE '%' || :query || '%'
           OR subcategory LIKE '%' || :query || '%'
    """)
    suspend fun searchQuestions(query: String): List<Question>
}
