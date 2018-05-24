package mitsura.kotlin.utils

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager


fun AppCompatActivity.hideKeyboard() = {
    val view = currentFocus
    if (view != null) {
        val imm = getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

fun AppCompatActivity.showFragmentIn(fragment: Fragment, @IdRes viewGroup: Int) = supportFragmentManager.beginTransaction().replace(viewGroup, fragment).commit()
