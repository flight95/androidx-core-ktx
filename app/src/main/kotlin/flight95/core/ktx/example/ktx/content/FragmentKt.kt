package flight95.core.ktx.example.ktx.content

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import flight95.core.ktx.content.getAppBarLayout
import flight95.core.ktx.content.getCollapsingToolbarImageSwitcher
import flight95.core.ktx.content.getCollapsingToolbarLayout
import flight95.core.ktx.content.setTitle
import flight95.core.ktx.example.R

@Suppress("unused")
fun Fragment.getAppBarLayout() = getAppBarLayout(R.id.app_bar)

@Suppress("unused")
fun Fragment.getCollapsingToolbarLayout() = getCollapsingToolbarLayout(R.id.toolbar_layout)

@Suppress("unused")
fun Fragment.getCollapsingToolbarImageSwitcher() = getCollapsingToolbarImageSwitcher(R.id.toolbar_image)

@Suppress("unused", "resourceType")
fun Fragment.setTitle(@StringRes title: Int) = setTitle(title, R.id.toolbar_layout)