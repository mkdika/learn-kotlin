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

}