package flight95.core.ktx.content

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageSwitcher
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout

private fun Fragment.getAppCompatActivity(): AppCompatActivity? = context as? AppCompatActivity

@Suppress("unused")
fun <T : View> Fragment.findViewById(@IdRes id: Int): T? =
    getAppCompatActivity()?.findViewById(id) as? T

@Suppress("unused")
fun Fragment.getDrawableResource(@DrawableRes id: Int): Drawable? =
    context?.run { ContextCompat.getDrawable(this, id) }

@Suppress("unused")
fun Fragment.getAppBarLayout(@IdRes id: Int): AppBarLayout? =
    findViewById(id) as? AppBarLayout

@Suppress("unused")
fun Fragment.getCollapsingToolbarLayout(@IdRes id: Int): CollapsingToolbarLayout? =
    findViewById(id) as? CollapsingToolbarLayout

@Suppress("unused")
fun Fragment.getCollapsingToolbarImageSwitcher(@IdRes id: Int): ImageSwitcher? =
    findViewById(id) as? ImageSwitcher

@Suppress("unused")
fun Fragment.setTitle(@StringRes title: Int, @IdRes id: Int) {
    getCollapsingToolbarLayout(id)?.title = context?.resources?.getString(title) ?: ""
}