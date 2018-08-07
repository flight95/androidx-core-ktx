package flight95.core.ktx.widget

import android.widget.FrameLayout
import android.widget.ImageSwitcher
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView

@Suppress("unused")
fun ImageSwitcher.setDefaultFactory() {
    context?.let {
        setInAnimation(it, android.R.anim.fade_in)
        setOutAnimation(it, android.R.anim.fade_out)
        setFactory {
            AppCompatImageView(it).apply {
                scaleType = ImageView.ScaleType.CENTER_CROP
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
            }
        }
    }
}