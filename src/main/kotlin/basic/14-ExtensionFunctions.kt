package basic

// add custom extension for String type
fun String.addXYZ(): String {
    return this + "XYZ!"
}

fun main(args: Array<String>) {
    val name: String = "Maikel"
    println(name.addXYZ())
}