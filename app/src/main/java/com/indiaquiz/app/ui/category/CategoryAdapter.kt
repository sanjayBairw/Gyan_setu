package com.indiaquiz.app.ui.category

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.indiaquiz.app.R
import com.indiaquiz.app.data.model.CategoryItem
import com.indiaquiz.app.databinding.ItemCategoryCardBinding

class CategoryAdapter(
    private val onCategoryClick: (CategoryItem) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private var categories: List<CategoryItem> = emptyList()
    private var isHindi: Boolean = false

    fun submitList(list: List<CategoryItem>, inHindi: Boolean) {
        categories = list
        isHindi = inHindi
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = ItemCategoryCardBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position])
    }

    override fun getItemCount(): Int = categories.size

    inner class CategoryViewHolder(private val binding: ItemCategoryCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CategoryItem) {
            val context = binding.root.context
            binding.tvCategoryTitle.text = if (isHindi) item.nameHi else item.nameEn
            binding.tvCategoryDescription.text = if (isHindi) item.descriptionHi else item.descriptionEn

            val subCount = item.subcategories.size
            binding.tvSubcategoriesCount.text = if (isHindi) {
                "$subCount उप-श्रेणियाँ • अभ्यास शुरू करें"
            } else {
                "$subCount Subcategories • Practice Now"
            }

            // Bind icon & color
            val iconResId = getDrawableResId(context, item.iconResName)
            binding.ivCategoryIcon.setImageResource(iconResId)

            val colorResId = getColorResId(context, item.colorResName)
            val color = ContextCompat.getColor(context, colorResId)
            binding.layoutIconBox.backgroundTintList = ColorStateList.valueOf(color)

            binding.root.setOnClickListener {
                onCategoryClick(item)
            }
        }

        private fun getDrawableResId(context: Context, resName: String): Int {
            val id = context.resources.getIdentifier(resName, "drawable", context.packageName)
            return if (id != 0) id else R.drawable.ic_exam
        }

        private fun getColorResId(context: Context, resName: String): Int {
            val id = context.resources.getIdentifier(resName, "color", context.packageName)
            return if (id != 0) id else R.color.academic_primary
        }
    }
}
