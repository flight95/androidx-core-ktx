package flight95.core.ktx.view.accessibility

import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Context
import android.view.accessibility.AccessibilityManager

@Suppress("unused")
fun AccessibilityManager.findEnabledAccessibilityServiceInfo(context: Context, feedbackType: Int):
    AccessibilityServiceInfo? =
    getEnabledAccessibilityServiceList(feedbackType)
        ?.firstOrNull {
            it.resolveInfo.serviceInfo?.run {
                packageName == context.applicationContext.packageName
            } ?: false
        }