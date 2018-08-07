package flight95.core.ktx.view

import android.animation.ValueAnimator
import android.view.HapticFeedbackConstants
import android.view.SoundEffectConstants
import android.view.View
import android.view.Window
import android.view.animation.AccelerateInterpolator
import androidx.annotation.DimenRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import androidx.core.view.updateLayoutParams
import flight95.core.ktx.content.getActivity
import flight95.core.ktx.util.Time

@Suppress("unused")
fun View.getActivity(): AppCompatActivity? = context.getActivity()

@Suppress("unused")
fun View.getWindow(): Window? = getActivity()?.window

@Suppress("unused")
fun View.getDecorView(): View? = getWindow()?.decorView

@Suppress("unused")
fun View.hideNavigationBar() {
    getDecorView()?.systemUiVisibility = systemUiVisibility or
        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
}

@Suppress("unused")
fun View.performFeedback() {
    playSoundEffect(SoundEffectConstants.CLICK);
    performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
}

@Suppress("unused")
fun View.animateLayoutHeight(@DimenRes height: Int, callback: (() -> Unit)? = null) {
    context?.resources?.getDimensionPixelSize(height)?.let {
        ValueAnimator.ofInt(layoutParams.height, it)
            .apply {
                duration = Time.LengthShort
                interpolator = AccelerateInterpolator()
                addUpdateListener {
                    updateLayoutParams { this.height = it.animatedValue as Int }
                }
                doOnEnd { callback?.invoke() }
            }
            .start()
    }
}