package basic

fun main(args: Array<String>) {

    val aToZ = "a".."z"
    val isTrue = "c" in aToZ
    println("c is in a to z : $isTrue")

    println()
    val oneToNine = 1..9
    val isFalse = 11 in oneToNine
    println("11 is in 1 to 9 : $isFalse")
    for (n in oneToNine) {
        print("$n ")
    }

    println()
    val countingDown = 100.downTo(0)
    val rangeTo = 10.rangeTo(20)
    println("countingDown: $countingDown")
    println("rangeTo: $rangeTo")

    // loop range down to
    println()
    for (i in 50 downTo 1 step 2) {
        print("$i ")
    }

    // loop range ascending to
    println()
    for (i in 50..100 step 2) {
        print("$i ")
    }

    // demo range pattern matching
    println("\n")
    println(recognize('3'))
    println(recognize('g'))
    println(recognize('X'))
    println(recognize('#'))
}

// range pattern matching with when
fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "$c is a digit!"
    in 'a'..'z', in 'A'..'Z' -> "$c is a letter!"
    else -> "I don't know..maybe special char!"
}
