package flight95.core.ktx.view

import android.view.View
import android.view.ViewParent

@Suppress("unused")
fun ViewParent.getWidth(): Int = (this as? View)?.width ?: 0

@Suppress("unused")
fun ViewParent.getHeight(): Int = (this as? View)?.height ?: 0