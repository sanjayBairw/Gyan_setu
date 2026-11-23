package com.indiaquiz.app.engine

import com.indiaquiz.app.data.local.PrepopulateData
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.QuizConfig
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class QuizEngineTest {

    private lateinit var sampleQuestions: List<Question>
    private lateinit var quizEngine: QuizEngine

    @Before
    fun setUp() {
        sampleQuestions = listOf(
            Question(
                id = "TEST_Q1",
                questionText = "What is the capital of India?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                chapterOrTopic = "Capitals",
                options = listOf("New Delhi", "Mumbai", "Kolkata", "Chennai"),
                correctAnswerIndex = 0,
                explanation = "New Delhi is the official capital of India.",
                negativeMarks = 0.25f
            ),
            Question(
                id = "TEST_Q2",
                questionText = "What is 15 * 8?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                chapterOrTopic = "Multiplication",
                options = listOf("110", "120", "130", "140"),
                correctAnswerIndex = 1,
                explanation = "15 * 8 = 120",
                negativeMarks = 0.25f
            ),
            Question(
                id = "TEST_Q3",
                questionText = "Unit of electrical resistance is:",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                chapterOrTopic = "Fundamentals",
                options = listOf("Ohm", "Volt", "Ampere", "Watt"),
                correctAnswerIndex = 0,
                explanation = "Resistance is measured in Ohms.",
                negativeMarks = 0.25f
            )
        )

        val config = QuizConfig(
            title = "Test Quiz",
            mode = "EXAM",
            enableNegativeMarking = true,
            questionCount = 3
        )
        quizEngine = QuizEngine(sampleQuestions, config)
    }

    @Test
    fun testInitialState() {
        assertEquals(3, quizEngine.totalCount)
        assertEquals(0, quizEngine.getCurrentIndex())
        assertEquals("TEST_Q1", quizEngine.getCurrentQuestion()?.id)
        assertEquals(0, quizEngine.getAnsweredCount())
        assertEquals(0, quizEngine.getMarkedForReviewCount())
    }

    @Test
    fun testSelectOptionAndClear() {
        quizEngine.selectOption(0)
        assertEquals(1, quizEngine.getAnsweredCount())
        assertEquals(0, quizEngine.getCurrentAnswer()?.selectedOptionIndex)

        quizEngine.clearAnswer()
        assertEquals(0, quizEngine.getAnsweredCount())
        assertEquals(-1, quizEngine.getCurrentAnswer()?.selectedOptionIndex)
    }

    @Test
    fun testMarkForReview() {
        val marked1 = quizEngine.toggleMarkForReview()
        assertTrue(marked1)
        assertEquals(1, quizEngine.getMarkedForReviewCount())

        val marked2 = quizEngine.toggleMarkForReview()
        assertFalse(marked2)
        assertEquals(0, quizEngine.getMarkedForReviewCount())
    }

    @Test
    fun testNavigation() {
        assertTrue(quizEngine.hasNext())
        assertFalse(quizEngine.hasPrevious())

        assertTrue(quizEngine.next())
        assertEquals(1, quizEngine.getCurrentIndex())
        assertEquals("TEST_Q2", quizEngine.getCurrentQuestion()?.id)

        assertTrue(quizEngine.jumpTo(2))
        assertEquals(2, quizEngine.getCurrentIndex())
        assertEquals("TEST_Q3", quizEngine.getCurrentQuestion()?.id)
        assertFalse(quizEngine.hasNext())

        assertTrue(quizEngine.previous())
        assertEquals(1, quizEngine.getCurrentIndex())
    }

    @Test
    fun testScoreCalculationWithNegativeMarking() {
        // Q1: Correct (option 0) -> +1.0
        quizEngine.selectOption(0)

        // Q2: Wrong (option 0 chosen, correct is 1) -> -0.25
        quizEngine.next()
        quizEngine.selectOption(0)

        // Q3: Skipped (no option chosen) -> 0
        quizEngine.next()

        val (attempt, records) = quizEngine.evaluateResult(elapsedTimeSeconds = 45)

        assertEquals(1, attempt.correctCount)
        assertEquals(1, attempt.wrongCount)
        assertEquals(1, attempt.skippedCount)
        assertEquals(0.75f, attempt.score, 0.01f)
        assertEquals(3.0f, attempt.maxScore, 0.01f)
        assertEquals(50.0f, attempt.accuracyPercentage, 0.01f)
        assertEquals(3, records.size)
    }

    @Test
    fun testPrepopulatedQuestionsIntegrity() {
        val questions = PrepopulateData.getQuestions()
        assertTrue("Prepopulated questions should have rich sample set", questions.size >= 20)

        for (q in questions) {
            assertNotNull("Question ID must not be null", q.id)
            assertTrue("Question text must not be empty", q.questionText.isNotBlank())
            assertTrue("Question must have at least 4 options", q.options.size >= 4)
            assertTrue(
                "Correct answer index must be within options bounds",
                q.correctAnswerIndex in 0 until q.options.size
            )
            assertTrue("Explanation must not be empty", q.explanation.isNotBlank())
        }
    }
}
