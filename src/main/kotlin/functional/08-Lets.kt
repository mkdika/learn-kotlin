package functional

fun main(args: Array<String>) {

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    var woi = "Numbers:..."
    numbers.let {
        var woi = it.map { it.toString() }.joinToString(",")
        println(woi)
    }
    println(woi)
}