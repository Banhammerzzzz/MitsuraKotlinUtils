package mitsura.kotlin.utils

import android.content.Context
import android.os.Build
import android.support.annotation.DimenRes
import android.support.annotation.LayoutRes
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.transition.TransitionManager

fun Context.animateLayout(layout: ConstraintLayout, @LayoutRes to: Int) {
    val transitionDoneSet = ConstraintSet()
    transitionDoneSet.clone(this, to)
    if (Build.VERSION.SDK_INT > 18) {
        TransitionManager.beginDelayedTransition(layout)
    }
    transitionDoneSet.applyTo(layout)
}

fun Context.fromDPToPX(@DimenRes res: Int): Int = resources.getDimension(res).toInt()