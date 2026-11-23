package com.indiaquiz.app.ui.bookmarks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.databinding.ItemBookmarkQuestionBinding

class BookmarksAdapter(
    private val isHindi: Boolean,
    private val onTtsClicked: (String) -> Unit,
    private val onRemoveBookmarkClicked: (Question) -> Unit
) : RecyclerView.Adapter<BookmarksAdapter.BookmarkViewHolder>() {

    private var questions: List<Question> = emptyList()

    fun submitList(list: List<Question>) {
        questions = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarkViewHolder {
        val binding = ItemBookmarkQuestionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return BookmarkViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookmarkViewHolder, position: Int) {
        holder.bind(questions[position])
    }

    override fun getItemCount(): Int = questions.size

    inner class BookmarkViewHolder(private val binding: ItemBookmarkQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: Question) {
            val examOrTopic = question.examOrBoard ?: question.chapterOrTopic
            binding.tvBookmarkCategoryTag.text = "$examOrTopic • ${question.difficulty}"

            val qText = if (isHindi && !question.questionTextHindi.isNullOrBlank()) {
                question.questionTextHindi
            } else {
                question.questionText
            }
            binding.tvBookmarkQuestionText.text = qText

            val options = if (isHindi && !question.optionsHindi.isNullOrEmpty()) {
                question.optionsHindi
            } else {
                question.options
            }
            val correctOpt = options.getOrElse(question.correctAnswerIndex) { "" }
            binding.tvBookmarkAnswer.text = if (isHindi) "सही उत्तर: $correctOpt" else "Answer: $correctOpt"

            val explanation = if (isHindi && !question.explanationHindi.isNullOrBlank()) {
                question.explanationHindi
            } else {
                question.explanation
            }
            binding.tvBookmarkExplanation.text = explanation

            binding.ivBookmarkTts.setOnClickListener {
                onTtsClicked("$qText. Answer is $correctOpt. $explanation")
            }

            binding.ivRemoveBookmark.setOnClickListener {
                onRemoveBookmarkClicked(question)
            }
        }
    }
}
