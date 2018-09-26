package basic

/**
 * Enum class example
 */
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main(args: Array<String>) {
    println("Color Blue is ${Color.BLUE}")
    Color.values().forEach { println(it) }
}
