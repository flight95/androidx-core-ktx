package flight95.core.ktx.example.ktx.widget

import com.google.android.material.snackbar.Snackbar
import flight95.core.ktx.example.R
import flight95.core.ktx.widget.appear

@Suppress("unused")
fun Snackbar.appear() =
    appear(R.color.snackbarBackground, R.color.snackbarTextColor, R.color.snackbarActionTextColor)