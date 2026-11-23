package com.indiaquiz.app.data.model

import java.io.Serializable

data class CategoryItem(
    val id: String,
    val nameEn: String,
    val nameHi: String,
    val descriptionEn: String,
    val descriptionHi: String,
    val iconResName: String,
    val colorResName: String,
    val subcategories: List<SubcategoryItem> = emptyList(),
    val totalQuestionsCount: Int = 0
) : Serializable

data class SubcategoryItem(
    val id: String,
    val categoryId: String,
    val nameEn: String,
    val nameHi: String,
    val descriptionEn: String,
    val descriptionHi: String,
    val examOrBoard: String? = null,
    val availableClasses: List<String> = emptyList(),
    val availableSubjects: List<String> = emptyList(),
    val availableTopics: List<String> = emptyList()
) : Serializable
