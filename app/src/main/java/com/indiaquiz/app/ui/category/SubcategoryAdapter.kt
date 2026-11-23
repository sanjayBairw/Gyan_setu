package com.indiaquiz.app.ui.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.data.model.SubcategoryItem
import com.indiaquiz.app.databinding.ItemSubCategoryBinding

class SubcategoryAdapter(
    private val isHindi: Boolean,
    private val onSubcategorySelected: (SubcategoryItem) -> Unit
) : RecyclerView.Adapter<SubcategoryAdapter.SubcategoryViewHolder>() {

    private var subcategories: List<SubcategoryItem> = emptyList()

    fun submitList(list: List<SubcategoryItem>) {
        subcategories = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubcategoryViewHolder {
        val binding = ItemSubCategoryBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return SubcategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubcategoryViewHolder, position: Int) {
        holder.bind(subcategories[position])
    }

    override fun getItemCount(): Int = subcategories.size

    inner class SubcategoryViewHolder(private val binding: ItemSubCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: SubcategoryItem) {
            binding.tvSubcategoryTitle.text = if (isHindi) item.nameHi else item.nameEn
            binding.tvSubcategoryDesc.text = if (isHindi) item.descriptionHi else item.descriptionEn

            binding.btnConfigureAndPlay.setOnClickListener {
                onSubcategorySelected(item)
            }
            binding.root.setOnClickListener {
                onSubcategorySelected(item)
            }
        }
    }
}
