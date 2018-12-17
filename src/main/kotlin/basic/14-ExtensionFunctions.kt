package basic

// add custom extension for String type
fun String.addXYZ(separator:String): String {
    return "${this+separator}XYZ!"
}

fun main(args: Array<String>) {
    val name: String = "Maikel"
    println(name.addXYZ("-_-"))
}