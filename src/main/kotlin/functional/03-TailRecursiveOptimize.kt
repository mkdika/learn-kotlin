package functional

/**
 * Kotlin tail recursive optimization example
 */
val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))

fun main(args: Array<String>) {
    val r = findFixPoint(0.786)
    println(r)
}