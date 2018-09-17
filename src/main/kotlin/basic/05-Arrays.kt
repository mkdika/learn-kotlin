package basic

fun main(args: Array<String>) {
    val array = arrayOf(1,2,3)
    array.forEach { print("$it ") }

    println()
    val square = Array(10, {k -> k * k})
    print("square is  : ")
    square.forEach { print("$it ") }
    println()
    println("square size: ${square.size}")
    println("square[9]  : ${square[9]}")
    square[0] = 999
    println("square[0]  : ${square[0]}")

}