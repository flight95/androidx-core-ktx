package flight95.core.ktx.content

import android.content.Context
import android.content.res.Configuration
import android.graphics.drawable.Drawable
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import flight95.core.ktx.view.getNavigationBarSize

@Suppress("unused")
fun Context.getActivity(): AppCompatActivity? = this as? AppCompatActivity

@Suppress("unused")
fun Context.getWindow(): Window? = getActivity()?.window

@Suppress("unused")
fun Context.getDecorView(): View? = getWindow()?.decorView

@Suppress("unused")
fun <T : View> Context.findViewById(@IdRes id: Int): T? =
    getActivity()?.findViewById(id) as? T

@Suppress("unused")
fun Context.getDefaultDisplay() =
    ContextCompat.getSystemService(this, WindowManager::class.java)?.defaultDisplay

@Suppress("unused")
fun Context.isPortrait(): Boolean = resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT

@Suppress("unused")
fun Context.getNavigationBarSize() = getDefaultDisplay()?.getNavigationBarSize()

@Suppress("unused")
fun Context.getDrawableResource(@DrawableRes id: Int): Drawable? =
    ContextCompat.getDrawable(this, id)