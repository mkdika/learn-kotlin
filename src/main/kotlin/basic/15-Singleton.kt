package basic

/**
 * A Kotlin way to create singleton class
 */
object Resource {
    val name = "Maikel"
}

fun main(args: Array<String>) {
    println(Resource.name)
}