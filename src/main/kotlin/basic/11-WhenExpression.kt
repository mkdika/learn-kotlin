package basic

/**
 * When Expression (Pattern Matching)
 * It is similar to Switch but more advanced and functional.
 */
fun main(args: Array<String>) {

    // when (value)
    val x: Int = 3

    when (x) {
        0 -> println("X is zero")
        1 -> println("X is one")
        2 -> println("X is two")
        3,4,5 -> println("X is about three to five") // can be combine together with comma separated
        else -> println("X is more than five")
    }

    // when as expression
    val isZero =
            when (x) {
                Int.MIN_VALUE -> true
                Int.MAX_VALUE -> true
                else -> false
            }
    println(isZero)

    val name = "Foox"
    val isFoo =
            when (name) {
                is String -> name.startsWith("Foo")
                else -> false
            }
    println(isFoo)
}

/**
 * When Without Argument
 *
 * This is replacement for if..else clause, and make it more readable
 */
fun whenWithoutArgs(x: Int, y: Int){
    when {
        x < y -> println("X is less than y")
        x > y -> println("X is greater than y")
        else -> println("X must equal to Y")
    }
}