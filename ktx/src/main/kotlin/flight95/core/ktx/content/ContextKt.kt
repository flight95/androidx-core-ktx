package flight95.core.ktx.content

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.view.Window
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

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
fun Context.getDrawableResource(@DrawableRes id: Int): Drawable? =
    ContextCompat.getDrawable(this, id)