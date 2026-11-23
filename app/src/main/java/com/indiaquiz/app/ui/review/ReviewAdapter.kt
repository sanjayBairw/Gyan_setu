package com.indiaquiz.app.ui.review

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.R
import com.indiaquiz.app.data.model.AttemptQuestionRecord
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.databinding.ItemReviewQuestionBinding

class ReviewAdapter(
    private val isHindi: Boolean,
    private val onTtsClicked: (String) -> Unit
) : RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

    private var items: List<Pair<Question, AttemptQuestionRecord>> = emptyList()

    fun submitList(list: List<Pair<Question, AttemptQuestionRecord>>) {
        items = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val binding = ItemReviewQuestionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ReviewViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val (q, record) = items[position]
        holder.bind(q, record, position)
    }

    override fun getItemCount(): Int = items.size

    inner class ReviewViewHolder(private val binding: ItemReviewQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: Question, record: AttemptQuestionRecord, position: Int) {
            val qNum = "Q ${position + 1} • ${question.difficulty}"
            binding.tvReviewQNumber.text = qNum

            val qText = if (isHindi && !question.questionTextHindi.isNullOrBlank()) {
                question.questionTextHindi
            } else {
                question.questionText
            }
            binding.tvReviewQuestionText.text = qText

            val options = if (isHindi && !question.optionsHindi.isNullOrEmpty()) {
                question.optionsHindi
            } else {
                question.options
            }

            val prefix = listOf("A", "B", "C", "D")

            // User Answer
            if (record.selectedOptionIndex == -1) {
                binding.tvReviewUserAnswer.text = if (isHindi) "छोड़ दिया (Skipped)" else "Skipped"
                binding.tvReviewUserAnswer.setTextColor(binding.root.context.getColor(R.color.text_secondary))
                binding.ivReviewStatusIcon.setImageResource(R.drawable.ic_cancel)
            } else {
                val optText = options.getOrElse(record.selectedOptionIndex) { "" }
                val optPrefix = prefix.getOrElse(record.selectedOptionIndex) { "" }
                binding.tvReviewUserAnswer.text = "($optPrefix) $optText"

                if (record.isCorrect) {
                    binding.tvReviewUserAnswer.setTextColor(binding.root.context.getColor(R.color.correct_green))
                    binding.ivReviewStatusIcon.setImageResource(R.drawable.ic_check_circle)
                } else {
                    binding.tvReviewUserAnswer.setTextColor(binding.root.context.getColor(R.color.wrong_red))
                    binding.ivReviewStatusIcon.setImageResource(R.drawable.ic_cancel)
                }
            }

            // Correct Answer
            val correctOptText = options.getOrElse(question.correctAnswerIndex) { "" }
            val correctOptPrefix = prefix.getOrElse(question.correctAnswerIndex) { "" }
            binding.tvReviewCorrectAnswer.text = "($correctOptPrefix) $correctOptText"

            // Explanation
            val explanation = if (isHindi && !question.explanationHindi.isNullOrBlank()) {
                question.explanationHindi
            } else {
                question.explanation
            }
            binding.tvReviewExplanation.text = explanation

            binding.ivReviewTts.setOnClickListener {
                onTtsClicked("$qText. Correct answer is $correctOptText. $explanation")
            }
        }
    }
}
