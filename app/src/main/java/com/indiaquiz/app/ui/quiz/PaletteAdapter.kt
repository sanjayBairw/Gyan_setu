package com.indiaquiz.app.ui.quiz

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.R
import com.indiaquiz.app.data.model.UserAnswer
import com.indiaquiz.app.databinding.ItemPaletteNumberBinding

class PaletteAdapter(
    private val onNumberClicked: (Int) -> Unit
) : RecyclerView.Adapter<PaletteAdapter.PaletteViewHolder>() {

    private var totalQuestions: Int = 0
    private var answersList: List<UserAnswer> = emptyList()
    private var currentActiveIndex: Int = 0

    fun setData(count: Int, answers: List<UserAnswer>, activeIndex: Int) {
        totalQuestions = count
        answersList = answers
        currentActiveIndex = activeIndex
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaletteViewHolder {
        val binding = ItemPaletteNumberBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PaletteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PaletteViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = totalQuestions

    inner class PaletteViewHolder(private val binding: ItemPaletteNumberBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            val context = binding.root.context
            val numberText = (position + 1).toString()
            binding.tvPaletteNumber.text = numberText

            val ans = answersList.getOrNull(position)

            if (position == currentActiveIndex) {
                // Currently active question: border ring / primary color
                binding.tvPaletteNumber.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#1A365D"))
                binding.tvPaletteNumber.setTextColor(Color.WHITE)
            } else if (ans != null && ans.isMarkedForReview) {
                // Marked for Review -> Purple
                binding.tvPaletteNumber.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.review_purple))
                binding.tvPaletteNumber.setTextColor(Color.WHITE)
            } else if (ans != null && ans.isAnswered) {
                // Answered -> Green
                binding.tvPaletteNumber.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.correct_green))
                binding.tvPaletteNumber.setTextColor(Color.WHITE)
            } else {
                // Unanswered -> Gray
                binding.tvPaletteNumber.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#E2E8F0"))
                binding.tvPaletteNumber.setTextColor(ContextCompat.getColor(context, R.color.text_primary))
            }

            binding.root.setOnClickListener {
                onNumberClicked(position)
            }
        }
    }
}
