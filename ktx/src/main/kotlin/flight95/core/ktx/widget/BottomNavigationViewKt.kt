package flight95.core.ktx.widget

import android.view.Gravity
import android.widget.FrameLayout
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import flight95.core.ktx.content.getNavigationBarSize
import flight95.core.ktx.content.isPortrait

@Suppress("unused")
fun BottomNavigationView.getMenuView(): BottomNavigationMenuView? {
    for (index in 0 until childCount) {
        getChildAt(index)?.let { if (it is BottomNavigationMenuView) return it }
    }
    return null
}

@Suppress("unused")
fun BottomNavigationView.updateMenuViewPadding(padding: Int) {
    getMenuView()?.updateLayoutParams<FrameLayout.LayoutParams> {
        gravity =
            when (padding) {
                0 -> Gravity.CENTER
                else -> Gravity.TOP or Gravity.CENTER_HORIZONTAL
            }
        updatePadding(bottom = padding)
    }
}

@Suppress("unused")
fun BottomNavigationView.setWindowTranslucentNavigation(enabled: Boolean) {
    updateMenuViewPadding(
        when {
            enabled && context.isPortrait() -> context.getNavigationBarSize()?.height ?: 0
            else -> 0
        }
    )
}

