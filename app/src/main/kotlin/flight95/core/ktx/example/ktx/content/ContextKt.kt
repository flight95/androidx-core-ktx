package flight95.core.ktx.example.ktx.content

import android.content.Context
import androidx.annotation.IdRes
import androidx.coordinatorlayout.widget.CoordinatorLayout
import flight95.core.ktx.content.findViewById
import flight95.core.ktx.example.R

@Suppress("unused")
fun Context.getRootView(@IdRes id: Int = R.id.root): CoordinatorLayout? =
    findViewById(id) as? CoordinatorLayout