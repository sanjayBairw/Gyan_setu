package com.indiaquiz.app.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.databinding.ItemSearchResultBinding

class SearchAdapter(
    private val isHindi: Boolean,
    private val onPracticeClicked: (Question) -> Unit
) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    private var questions: List<Question> = emptyList()

    fun submitList(list: List<Question>) {
        questions = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val binding = ItemSearchResultBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return SearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bind(questions[position])
    }

    override fun getItemCount(): Int = questions.size

    inner class SearchViewHolder(private val binding: ItemSearchResultBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: Question) {
            val examTag = question.examOrBoard ?: question.category.replace("_", " ")
            binding.tvSearchTag.text = "$examTag • ${question.chapterOrTopic}"
            binding.tvSearchDifficulty.text = question.difficulty

            val text = if (isHindi && !question.questionTextHindi.isNullOrBlank()) {
                question.questionTextHindi
            } else {
                question.questionText
            }
            binding.tvSearchQuestionText.text = text

            binding.btnPracticeThisTopic.setOnClickListener {
                onPracticeClicked(question)
            }
            binding.root.setOnClickListener {
                onPracticeClicked(question)
            }
        }
    }
}
