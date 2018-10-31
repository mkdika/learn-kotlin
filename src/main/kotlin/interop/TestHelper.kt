package interop



fun String.hello(name: String) = println("Hello $name!")

fun main(args: Array<String>) {
    val tes = "test"
    tes.hello("maikel")
}