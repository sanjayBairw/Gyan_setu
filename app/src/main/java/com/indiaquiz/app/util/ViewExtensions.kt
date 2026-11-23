package com.indiaquiz.app.util

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

/**
 * Extension functions to handle Android Edge-to-Edge window insets cleanly.
 * Prevents content from hiding behind the status bar or navigation bar.
 */
fun View.applyStatusBarPadding() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { view, insets ->
        val statusBar = insets.getInsets(WindowInsetsCompat.Type.statusBars())
        view.updatePadding(top = statusBar.top)
        insets
    }
}

fun View.applyNavigationBarPadding(extraPaddingDp: Int = 0) {
    val density = resources.displayMetrics.density
    val extraPx = (extraPaddingDp * density).toInt()
    ViewCompat.setOnApplyWindowInsetsListener(this) { view, insets ->
        val navInsets = insets.getInsets(WindowInsetsCompat.Type.navigationBars())
        view.updatePadding(bottom = navInsets.bottom + extraPx)
        insets
    }
}
