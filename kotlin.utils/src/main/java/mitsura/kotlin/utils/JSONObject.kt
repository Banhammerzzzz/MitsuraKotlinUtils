package mitsura.kotlin.utils

import org.json.JSONObject

fun JSONObject.getStringDefault(key: String): String =
        if (!isNull(key)) getString(key) else ""

fun JSONObject.getIntDefault(key: String): Int =
        if (!isNull(key)) getInt(key) else 0

fun JSONObject.getFloatDefault(key: String): Float =
        if (!isNull(key)) getDouble(key).toFloat() else 0f

fun JSONObject.getDoubleDefault(key: String): Double =
        if (!isNull(key)) getDouble(key) else 0.toDouble()

fun JSONObject.getBooleanDefault(key: String): Boolean =
        if (!isNull(key)) getBoolean(key) else false

fun JSONObject.getLongDefault(key: String): Long =
        if (!isNull(key)) getLong(key) else 0L

fun JSONObject.getJSONObjectDefault(key: String): JSONObject? =
        if (!isNull(key)) getJSONObject(key) else null