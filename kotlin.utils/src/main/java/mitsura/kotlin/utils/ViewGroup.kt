package mitsura.kotlin.utils

import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup

fun ViewGroup.forEachChild(predicate: (View) -> Unit) {
    for (i in 0 until childCount) {
        val child = getChildAt(i)
        predicate(child)
    }
}

fun ViewGroup.forEachChildRecursive(predicate: (View) -> Unit) {
    for (i in 0 until childCount) {
        val child = getChildAt(i)
        when (child) {
            is ViewGroup -> {
                predicate(child)
                child.forEachChildRecursive(predicate)
            }
            else -> predicate(child)
        }
    }
}

fun ViewGroup.hideKeyboardWhenClick() {
    setOnClickListener {
        if (context is AppCompatActivity) {
            (context as AppCompatActivity).hideKeyboard()
        }
    }
}