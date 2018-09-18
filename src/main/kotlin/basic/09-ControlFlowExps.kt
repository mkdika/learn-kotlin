package basic

import java.io.IOException
import java.util.Date

fun main(args: Array<String>) {
    val date = Date()
    val today = if (date.year == 2018) true else false
    println(today)

    fun isZero(x: Int):Boolean {
        return if (x == 0) true else false
    }
    println(isZero(0))

    // exception as syntax
    val success = try {
        true
    } catch (e: IOException) {
        false
    }
}