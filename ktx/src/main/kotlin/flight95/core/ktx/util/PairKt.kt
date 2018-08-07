package flight95.core.ktx.util

import kotlin.math.pow
import kotlin.math.sqrt

@Suppress("unused")
fun Pair<Float, Float>.distance(target: Pair<Float, Float>): Float =
    sqrt((first - target.first).pow(2) + (second - target.second).pow(2))