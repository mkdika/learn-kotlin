package functional

/**
 * infix notation can be use to omitting the dot and the
 * parentheses call.
 */
infix fun String.love(you: String):String {
    return "$this love $you"
}

fun main(args: Array<String>) {
    val meh = "I" love "You"
    println(meh)
}
