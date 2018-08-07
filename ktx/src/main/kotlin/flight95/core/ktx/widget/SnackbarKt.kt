package flight95.core.ktx.widget

import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

@Suppress("unused")
fun Snackbar.appear(
    @ColorRes background: Int,
    @ColorRes textColor: Int,
    @ColorRes actionTextColor: Int) {
    setActionTextColor(ContextCompat.getColor(context, actionTextColor))
    with(view) {
        findViewById<TextView>(com.google.android.material.R.id.snackbar_text)?.apply {
            setTextColor(ContextCompat.getColor(context, textColor))
        }
        setBackgroundColor(ContextCompat.getColor(context, background))
    }
    show()
}

@Suppress("unused")
fun Snackbar.SnackbarLayout.setAnchor(anchor: View) {
    (layoutParams as? CoordinatorLayout.LayoutParams)?.apply {
        anchorId = anchor.id
        anchorGravity = android.view.Gravity.TOP
        gravity = android.view.Gravity.TOP
    }?.also {
        layoutParams = it
    }
}