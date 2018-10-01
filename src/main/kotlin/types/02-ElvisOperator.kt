package types

/**
 * Elvis operator ?: demo.
 * is use to null-coalescing/NVL operator.
 */
fun foo(s: String?): String = s ?: "is Null!" // if s is null, then return "is Null!"

fun strLen(s : String) = s.length ?: 999


fun main(args: Array<String>) {
    println(foo("maikel"))
    println(foo(null))

    println(strLen("Maikel"))
    println(strLen(null))
}