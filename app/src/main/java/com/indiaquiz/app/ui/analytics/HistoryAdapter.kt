package com.indiaquiz.app.ui.analytics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.data.model.QuizAttempt
import com.indiaquiz.app.databinding.ItemHistoryAttemptBinding
import java.text.SimpleDateFormat
import java.util.*

class HistoryAdapter(
    private val onAttemptClicked: (QuizAttempt) -> Unit
) : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    private var attempts: List<QuizAttempt> = emptyList()
    private val dateFormat = SimpleDateFormat("dd MMM, hh:mm a", Locale.getDefault())

    fun submitList(list: List<QuizAttempt>) {
        attempts = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding = ItemHistoryAttemptBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(attempts[position])
    }

    override fun getItemCount(): Int = attempts.size

    inner class HistoryViewHolder(private val binding: ItemHistoryAttemptBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(attempt: QuizAttempt) {
            binding.tvHistoryQuizTitle.text = attempt.quizTitle
            val dateStr = dateFormat.format(Date(attempt.timestamp))
            binding.tvHistoryDateMode.text = "$dateStr • ${attempt.quizMode}"

            binding.tvHistoryScore.text = String.format(Locale.getDefault(), "%.1f / %.0f", attempt.score, attempt.maxScore)
            binding.tvHistoryAccuracy.text = String.format(Locale.getDefault(), "%.0f%% Acc", attempt.accuracyPercentage)

            binding.root.setOnClickListener {
                onAttemptClicked(attempt)
            }
        }
    }
}
