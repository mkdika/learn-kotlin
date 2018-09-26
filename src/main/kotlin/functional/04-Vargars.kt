package functional

fun <String> asListX(vararg ts: String): List<String> {
    val result = ArrayList<String>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun main(args: Array<String>) {
    val result = asListX("Maikel","Max","John")
    println(result)
}