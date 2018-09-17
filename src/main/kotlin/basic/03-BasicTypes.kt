package basic

fun main(args: Array<String>) {

    // String
    val name = "Maikel"

    val char = 'Z'

    // Boolean
    val isMale = true

    // Number
    val int = 12
    val long = 12_000_000_000L
    val double = 12.345
    val float = 12.345F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    // explicit widening of numbers
    val long2 = int.toLong()
    val double2 = float.toDouble()

    println("Done!")
}