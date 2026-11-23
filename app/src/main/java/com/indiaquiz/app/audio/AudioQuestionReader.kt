package com.indiaquiz.app.audio

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import java.util.Locale

class AudioQuestionReader(
    private val context: Context,
    private val onInitComplete: ((Boolean) -> Unit)? = null
) : TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null
    private var isInitialized = false
    private var isSpeaking = false
    var onSpeechStateChanged: ((Boolean) -> Unit)? = null

    init {
        tts = TextToSpeech(context.applicationContext, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            isInitialized = true
            tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
                override fun onStart(utteranceId: String?) {
                    isSpeaking = true
                    onSpeechStateChanged?.invoke(true)
                }

                override fun onDone(utteranceId: String?) {
                    isSpeaking = false
                    onSpeechStateChanged?.invoke(false)
                }

                @Deprecated("Deprecated in Java")
                override fun onError(utteranceId: String?) {
                    isSpeaking = false
                    onSpeechStateChanged?.invoke(false)
                }
            })
            onInitComplete?.invoke(true)
        } else {
            isInitialized = false
            Log.e("AudioQuestionReader", "TTS initialization failed with code: $status")
            onInitComplete?.invoke(false)
        }
    }

    fun setSpeechRate(rate: Float) {
        tts?.setSpeechRate(rate)
    }

    fun speak(text: String, utteranceId: String = "QUESTION_SPEECH") {
        if (!isInitialized || text.isBlank()) return

        val hasDevanagari = text.any { it in '\u0900'..'\u097F' }
        val targetLocale = if (hasDevanagari) Locale.forLanguageTag("hi-IN") else Locale.ENGLISH

        val result = tts?.setLanguage(targetLocale)
        if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
            // Fallback to default locale
            tts?.language = Locale.getDefault()
        }

        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
    }

    fun readQuestionWithOptions(
        questionText: String,
        options: List<String>,
        languagePref: String = "BOTH"
    ) {
        if (!isInitialized) return
        stop()

        val fullScript = StringBuilder()
        fullScript.append(questionText).append(". ")

        val optionPrefixes = listOf("Option A: ", "Option B: ", "Option C: ", "Option D: ")
        val optionPrefixesHindi = listOf("विकल्प A: ", "विकल्प B: ", "विकल्प C: ", "विकल्प D: ")

        val isHindi = questionText.any { it in '\u0900'..'\u097F' }
        val prefixes = if (isHindi) optionPrefixesHindi else optionPrefixes

        options.forEachIndexed { index, opt ->
            val prefix = prefixes.getOrElse(index) { "Option ${index + 1}: " }
            fullScript.append(prefix).append(opt).append(". ")
        }

        speak(fullScript.toString(), "FULL_QUESTION_SPEECH")
    }

    fun stop() {
        if (tts != null && isInitialized) {
            tts?.stop()
            isSpeaking = false
            onSpeechStateChanged?.invoke(false)
        }
    }

    fun isCurrentlySpeaking(): Boolean {
        return isSpeaking || (tts?.isSpeaking == true)
    }

    fun shutdown() {
        try {
            tts?.stop()
            tts?.shutdown()
            tts = null
            isInitialized = false
        } catch (e: Exception) {
            Log.e("AudioQuestionReader", "Error shutting down TTS", e)
        }
    }
}
