package com.indiaquiz.app.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.indiaquiz.app.data.model.UserAnswer
import com.indiaquiz.app.databinding.BottomSheetQuestionPaletteBinding

class QuestionPaletteBottomSheet(
    private val totalQuestions: Int,
    private val answers: List<UserAnswer>,
    private val currentActiveIndex: Int,
    private val onQuestionSelected: (Int) -> Unit,
    private val onSubmitRequested: () -> Unit
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetQuestionPaletteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetQuestionPaletteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val answeredCount = answers.count { it.isAnswered }
        val reviewCount = answers.count { it.isMarkedForReview }
        val skippedCount = totalQuestions - answeredCount

        binding.tvLegendAnswered.text = "Answered ($answeredCount)"
        binding.tvLegendReview.text = "Review ($reviewCount)"
        binding.tvLegendSkipped.text = "Unanswered ($skippedCount)"

        val adapter = PaletteAdapter { index ->
            dismiss()
            onQuestionSelected(index)
        }
        binding.rvPaletteGrid.layoutManager = GridLayoutManager(requireContext(), 5)
        binding.rvPaletteGrid.adapter = adapter
        adapter.setData(totalQuestions, answers, currentActiveIndex)

        binding.btnSubmitFromPalette.setOnClickListener {
            dismiss()
            onSubmitRequested()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "QuestionPaletteBottomSheet"
    }
}
