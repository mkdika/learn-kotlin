package types

// manual check nullable type
fun strLen(s: String?) = if (s != null) s.length else 0

// automatic/idiomatic check nullable type
fun strLen2(s: String?) = s?.length

fun main(args: Array<String>) {
    strLen(null)
}