package com.indiaquiz.app.ui.quiz

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.R
import com.indiaquiz.app.databinding.ItemOptionBinding

class OptionsAdapter(
    private val onOptionClick: (Int) -> Unit
) : RecyclerView.Adapter<OptionsAdapter.OptionViewHolder>() {

    private var options: List<String> = emptyList()
    private var selectedIndex: Int = -1
    private var correctIndex: Int = -1
    private var isPracticeMode: Boolean = false
    private val prefixes = listOf("A", "B", "C", "D", "E", "F")

    fun setOptions(
        newOptions: List<String>,
        userSelectedIndex: Int,
        actualCorrectIndex: Int,
        practiceMode: Boolean
    ) {
        options = newOptions
        selectedIndex = userSelectedIndex
        correctIndex = actualCorrectIndex
        isPracticeMode = practiceMode
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OptionViewHolder {
        val binding = ItemOptionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return OptionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OptionViewHolder, position: Int) {
        holder.bind(options[position], position)
    }

    override fun getItemCount(): Int = options.size

    inner class OptionViewHolder(private val binding: ItemOptionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(text: String, position: Int) {
            val context = binding.root.context
            binding.tvOptionBadge.text = prefixes.getOrElse(position) { "${position + 1}" }
            binding.tvOptionText.text = text

            if (isPracticeMode && selectedIndex != -1) {
                // Practice mode after answering: reveal correct / wrong
                binding.root.isClickable = false
                when (position) {
                    correctIndex -> {
                        binding.cardOption.setCardBackgroundColor(ContextCompat.getColor(context, R.color.correct_green_bg))
                        binding.cardOption.strokeColor = ContextCompat.getColor(context, R.color.correct_green)
                        binding.ivFeedbackIcon.visibility = View.VISIBLE
                        binding.ivFeedbackIcon.setImageResource(R.drawable.ic_check_circle)
                    }
                    selectedIndex -> {
                        // User chose wrong
                        binding.cardOption.setCardBackgroundColor(ContextCompat.getColor(context, R.color.wrong_red_bg))
                        binding.cardOption.strokeColor = ContextCompat.getColor(context, R.color.wrong_red)
                        binding.ivFeedbackIcon.visibility = View.VISIBLE
                        binding.ivFeedbackIcon.setImageResource(R.drawable.ic_cancel)
                    }
                    else -> {
                        binding.cardOption.setCardBackgroundColor(Color.WHITE)
                        binding.cardOption.strokeColor = ContextCompat.getColor(context, R.color.surface_stroke)
                        binding.ivFeedbackIcon.visibility = View.GONE
                    }
                }
            } else {
                // Exam mode or before answering in Practice mode
                binding.root.isClickable = true
                binding.ivFeedbackIcon.visibility = View.GONE

                if (position == selectedIndex) {
                    binding.cardOption.setCardBackgroundColor(Color.parseColor("#EFF6FF"))
                    binding.cardOption.strokeColor = Color.parseColor("#2563EB")
                    binding.tvOptionBadge.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#2563EB"))
                    binding.tvOptionBadge.setTextColor(Color.WHITE)
                } else {
                    binding.cardOption.setCardBackgroundColor(Color.WHITE)
                    binding.cardOption.strokeColor = ContextCompat.getColor(context, R.color.surface_stroke)
                    binding.tvOptionBadge.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#E2E8F0"))
                    binding.tvOptionBadge.setTextColor(ContextCompat.getColor(context, R.color.text_primary))
                }
            }

            binding.root.setOnClickListener {
                if (!isPracticeMode || selectedIndex == -1) {
                    onOptionClick(position)
                }
            }
        }
    }
}
