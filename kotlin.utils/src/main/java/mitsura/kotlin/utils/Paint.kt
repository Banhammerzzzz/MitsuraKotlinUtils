package mitsura.kotlin.utils

import android.graphics.Paint
import android.graphics.Rect


fun Paint.getRectForTextWith(text: String, width: Float, height: Float, shrinkCoef: Float = 0.8f): Rect {
    val rect = Rect()
    do {
        getTextBounds(text, 0, text.length, rect)
        textSize -= 1
    } while (rect.width() > width * shrinkCoef || rect.height() > height * shrinkCoef)
    return rect
}

fun Paint.getTextBounds(text: String, rect: Rect) = getTextBounds(text, 0, text.length, rect)