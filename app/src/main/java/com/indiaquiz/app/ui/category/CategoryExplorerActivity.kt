package com.indiaquiz.app.ui.category

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.IntentCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.indiaquiz.app.IndiaQuizApp
import com.indiaquiz.app.R
import com.indiaquiz.app.data.local.PrepopulateData
import com.indiaquiz.app.data.model.CategoryItem
import com.indiaquiz.app.data.model.QuizConfig
import com.indiaquiz.app.data.model.SubcategoryItem
import com.indiaquiz.app.databinding.ActivityCategoryExplorerBinding
import com.indiaquiz.app.databinding.DialogQuizConfigBinding
import com.indiaquiz.app.theme.ThemeManager
import com.indiaquiz.app.ui.quiz.QuizActivity
import com.indiaquiz.app.util.LocaleHelper
import com.indiaquiz.app.util.PreferenceHelper
import com.indiaquiz.app.util.applyStatusBarPadding

class CategoryExplorerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryExplorerBinding
    private lateinit var prefs: PreferenceHelper
    private var currentCategory: CategoryItem? = null

    override fun attachBaseContext(newBase: Context) {
        val helper = PreferenceHelper(newBase)
        super.attachBaseContext(LocaleHelper.applyLocale(newBase, helper.selectedLanguage))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = (application as IndiaQuizApp).preferenceHelper
        currentCategory = IntentCompat.getSerializableExtra(intent, "EXTRA_CATEGORY_ITEM", CategoryItem::class.java)
        if (currentCategory == null) {
            val catId = intent.getStringExtra("EXTRA_CATEGORY_ID")
            if (catId != null) {
                currentCategory = PrepopulateData.getCategories().find { it.id == catId }
            }
        }
        ThemeManager.applyTheme(this, currentCategory?.id)
        super.onCreate(savedInstanceState)

        binding = ActivityCategoryExplorerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarCategory.applyStatusBarPadding()

        setupToolbar()
        populateCategoryDetails()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarCategory)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarCategory.setNavigationOnClickListener {
            finish()
        }
    }

    private fun populateCategoryDetails() {
        val isHindi = prefs.selectedLanguage == "hi"
        val category = currentCategory ?: return

        binding.toolbarCategory.title = if (isHindi) category.nameHi else category.nameEn
        binding.tvExplorerCatTitle.text = if (isHindi) category.nameHi else category.nameEn
        binding.tvExplorerCatDesc.text = if (isHindi) category.descriptionHi else category.descriptionEn

        val adapter = SubcategoryAdapter(isHindi) { subcategory ->
            showQuizConfigDialog(category, subcategory)
        }
        binding.rvSubcategories.layoutManager = LinearLayoutManager(this)
        binding.rvSubcategories.adapter = adapter
        adapter.submitList(category.subcategories)
    }

    private fun showQuizConfigDialog(category: CategoryItem, subcategory: SubcategoryItem) {
        val isHindi = prefs.selectedLanguage == "hi"
        val dialogBinding = DialogQuizConfigBinding.inflate(LayoutInflater.from(this))

        val title = if (isHindi) subcategory.nameHi else subcategory.nameEn
        dialogBinding.tvDialogTarget.text = "$title (${if (isHindi) category.nameHi else category.nameEn})"

        val isSchoolCategory = category.id == "SCHOOL_EDUCATION" || subcategory.examOrBoard in listOf("CBSE", "RBSE", "Bihar Board", "UP Board") || subcategory.availableClasses.isNotEmpty()
        val isJeeCategory = subcategory.id == "JEE_MAIN_ADVANCED" || subcategory.examOrBoard == "JEE"

        if (isSchoolCategory) {
            dialogBinding.layoutClassSelector.visibility = View.VISIBLE
            dialogBinding.layoutSubjectSelector.visibility = View.VISIBLE

            fun populateSubjectsForClass(selectedClass: String?) {
                dialogBinding.chipGroupSubject.removeAllViews()
                val subjects = when (selectedClass) {
                    "Class 1", "Class 2", "Class 3", "Class 4", "Class 5" ->
                        listOf("All Subjects", "Mathematics", "Science", "Social Science", "Hindi", "English")
                    "Class 6", "Class 7", "Class 8" ->
                        listOf("All Subjects", "Mathematics", "Science", "Social Science", "Hindi", "English")
                    "Class 9", "Class 10" ->
                        listOf("All Subjects", "Physics", "Chemistry", "Biology", "Science", "Mathematics", "Social Science", "Hindi", "English")
                    "Class 11", "Class 12" ->
                        listOf("All Subjects", "Physics", "Chemistry", "Mathematics", "Biology", "English", "Hindi")
                    else -> {
                        if (subcategory.availableSubjects.isNotEmpty()) {
                            val list = mutableListOf("All Subjects")
                            list.addAll(subcategory.availableSubjects.filter { it != "All Subjects" })
                            list.distinct()
                        } else {
                            listOf("All Subjects", "Physics", "Chemistry", "Biology", "Science", "Mathematics", "Social Science", "Hindi", "English")
                        }
                    }
                }
                subjects.forEachIndexed { index, subj ->
                    val chip = Chip(this).apply {
                        text = getLocalizedSubjectName(subj, isHindi)
                        tag = subj
                        isCheckable = true
                        isChecked = (index == 0)
                    }
                    dialogBinding.chipGroupSubject.addView(chip)
                }
            }

            val classList = listOf("All Classes") + (1..12).map { "Class $it" }
            dialogBinding.chipGroupClass.removeAllViews()
            classList.forEachIndexed { index, cls ->
                val chip = Chip(this).apply {
                    id = View.generateViewId()
                    text = if (isHindi) (if (cls == "All Classes") "सभी कक्षाएं" else "कक्षा ${cls.replace("Class ", "")}") else cls
                    tag = cls
                    isCheckable = true
                    isChecked = (index == 0)
                }
                dialogBinding.chipGroupClass.addView(chip)
            }

            populateSubjectsForClass(null)

            dialogBinding.chipGroupClass.setOnCheckedStateChangeListener { group, checkedIds ->
                val checkedId = checkedIds.firstOrNull() ?: View.NO_ID
                val selectedClass = if (checkedId != View.NO_ID) {
                    val chip = group.findViewById<Chip>(checkedId)
                    val raw = chip?.tag as? String ?: chip?.text?.toString()
                    if (raw == null || raw == "All Classes" || raw == "सभी कक्षाएं") null else raw
                } else null
                populateSubjectsForClass(selectedClass)
            }
        } else if (isJeeCategory) {
            dialogBinding.layoutClassSelector.visibility = View.GONE
            dialogBinding.layoutSubjectSelector.visibility = View.VISIBLE

            val jeeSubjects = listOf("All Subjects", "Physics", "Chemistry", "Mathematics")
            dialogBinding.chipGroupSubject.removeAllViews()
            jeeSubjects.forEachIndexed { index, subj ->
                val chip = Chip(this).apply {
                    text = getLocalizedSubjectName(subj, isHindi)
                    tag = subj
                    isCheckable = true
                    isChecked = (index == 0)
                }
                dialogBinding.chipGroupSubject.addView(chip)
            }
        } else if (subcategory.availableSubjects.isNotEmpty()) {
            dialogBinding.layoutClassSelector.visibility = View.GONE
            dialogBinding.layoutSubjectSelector.visibility = View.VISIBLE

            val list = mutableListOf("All Subjects")
            list.addAll(subcategory.availableSubjects.filter { it != "All Subjects" })
            dialogBinding.chipGroupSubject.removeAllViews()
            list.forEachIndexed { index, subj ->
                val chip = Chip(this).apply {
                    text = getLocalizedSubjectName(subj, isHindi)
                    tag = subj
                    isCheckable = true
                    isChecked = (index == 0)
                }
                dialogBinding.chipGroupSubject.addView(chip)
            }
        } else {
            dialogBinding.layoutClassSelector.visibility = View.GONE
            dialogBinding.layoutSubjectSelector.visibility = View.GONE
        }

        val dialog = MaterialAlertDialogBuilder(this)
            .setView(dialogBinding.root)
            .create()

        dialogBinding.btnDialogCancel.setOnClickListener {
            dialog.dismiss()
        }

        dialogBinding.btnDialogStart.setOnClickListener {
            val mode = if (dialogBinding.rbPracticeMode.isChecked) "PRACTICE" else "EXAM"

            val difficulty = when {
                dialogBinding.chipDiffEasy.isChecked -> "EASY"
                dialogBinding.chipDiffMedium.isChecked -> "MEDIUM"
                dialogBinding.chipDiffHard.isChecked -> "HARD"
                else -> "ALL"
            }

            val count = when {
                dialogBinding.chipCount5.isChecked -> 5
                dialogBinding.chipCount20.isChecked -> 20
                else -> 10
            }

            val selectedClass = if (dialogBinding.layoutClassSelector.visibility == View.VISIBLE) {
                val checkedId = dialogBinding.chipGroupClass.checkedChipId
                if (checkedId != View.NO_ID) {
                    val chip = dialogBinding.chipGroupClass.findViewById<Chip>(checkedId)
                    val raw = chip?.tag as? String ?: chip?.text?.toString()
                    if (raw == null || raw == "All Classes" || raw == "सभी कक्षाएं") null else raw
                } else null
            } else null

            val selectedSubject = if (dialogBinding.layoutSubjectSelector.visibility == View.VISIBLE) {
                val checkedId = dialogBinding.chipGroupSubject.checkedChipId
                if (checkedId != View.NO_ID) {
                    val chip = dialogBinding.chipGroupSubject.findViewById<Chip>(checkedId)
                    val rawSubject = chip?.tag as? String ?: chip?.text?.toString()
                    if (rawSubject == null || rawSubject.equals("All Subjects", ignoreCase = true) || rawSubject.equals("सभी विषय", ignoreCase = true)) {
                        null
                    } else {
                        rawSubject
                    }
                } else null
            } else null

            val subDetails = listOfNotNull(selectedClass, selectedSubject).joinToString(" • ")
            val fullTitle = if (subDetails.isNotEmpty()) "$title ($subDetails)" else title

            val inferredSubject = selectedSubject ?: when (category.id) {
                "MATHEMATICS" -> "Mathematics"
                "REASONING" -> "Reasoning"
                "HINDI_LANGUAGE" -> "Hindi"
                "ENGLISH_LANGUAGE" -> "English"
                else -> null
            }

            val config = QuizConfig(
                title = fullTitle,
                category = category.id,
                subcategory = subcategory.id,
                examOrBoard = subcategory.examOrBoard,
                targetClass = selectedClass,
                subject = inferredSubject,
                difficulty = difficulty,
                questionCount = count,
                mode = mode,
                enableNegativeMarking = prefs.isNegativeMarkingEnabled && mode == "EXAM",
                timePerQuestionSeconds = prefs.perQuestionTimerSeconds
            )

            dialog.dismiss()
            val intent = Intent(this, QuizActivity::class.java).apply {
                putExtra("EXTRA_QUIZ_CONFIG", config)
            }
            startActivity(intent)
        }

        dialog.show()
    }

    private fun getLocalizedSubjectName(subject: String, isHindi: Boolean): String {
        if (!isHindi) return subject
        return when (subject) {
            "All Subjects" -> "सभी विषय"
            "Mathematics" -> "गणित (Math)"
            "Science" -> "विज्ञान (Science)"
            "Physics" -> "भौतिक विज्ञान (Physics)"
            "Chemistry" -> "रसायन विज्ञान (Chemistry)"
            "Biology" -> "जीव विज्ञान (Biology)"
            "Social Science" -> "सामाजिक विज्ञान"
            "Hindi" -> "हिंदी (Hindi)"
            "English" -> "अंग्रेजी (English)"
            else -> subject
        }
    }
}
