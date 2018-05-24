package mitsura.kotlin.utils

import android.content.res.Resources

fun Number.DpToPx() = (this.toInt() * Resources.getSystem().displayMetrics.density).toInt()
