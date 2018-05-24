package mitsura.kotlin.utils

import android.content.res.Resources

val Number.DpToPx: Int
    get() = (this.toInt() * Resources.getSystem().displayMetrics.density).toInt()
