package flight95.core.ktx.view

import android.graphics.Point
import android.util.Size
import android.view.Display

@Suppress("unused")
fun Display.getSize() =
    Point().run {
        getSize(this)
        Size(x, y)
    }

@Suppress("unused")
fun Display.getRealSize() =
    Point().run {
        getRealSize(this)
        Size(x, y)
    }

@Suppress("unused")
fun Display.getNavigationBarSize(): Size? =
    Pair(getSize(), getRealSize()).run {
        when {
            first.width < second.width -> Size(second.width - first.width, first.height) // navigation bar on the side.
            first.height < second.height -> Size(first.width, second.height - first.height) // navigation bar at the bottom.
            else -> null // hardware navigation bar.
        }
    }