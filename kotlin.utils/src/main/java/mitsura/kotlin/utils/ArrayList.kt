package mitsura.kotlin.utils

fun <T> List<T>.findClosestToInSortedList(value: Float, predicate: (T) -> Float): T? = this.sortedBy(predicate).findClosestTo(value, predicate)

fun <T> List<T>.findClosestTo(value: Float, predicate: (T) -> Float): T? {
    if (size == 1) return this[0]

    fun checkTwo(lItem: T, rItem: T): T? {
        val left = predicate(lItem)
        val right = predicate(rItem)
        if (left < value && value < right) {
            val distanceToLeft = Math.abs(value - left)
            val distanceToRight = Math.abs(value - right)
            if (distanceToLeft < distanceToRight) {
                return lItem
            } else {
                return rItem
            }
        }
        return null
    }
    for (i in 0 until size) {
        when (i) {
            0 -> {
                if (predicate(this[i]) > value) {
                    return this[i]
                } else {
                    val item = checkTwo(this[i], this[i + 1])
                    if (item != null) return item
                }
            }
            size - 1 -> {
                if (predicate(this[i]) < value) return this[i]
            }
            else -> {
                val item = checkTwo(this[i], this[i + 1])
                if (item != null) return item
            }
        }
    }
    return null
}