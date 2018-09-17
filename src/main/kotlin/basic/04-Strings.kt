package basic

fun main(args: Array<String>) {

    // double quote string
    val str1 = "Maikel\n\tChandika"
    println(str1)

    // triple quote string (Raw String/Text)
    val str2 = """
        This is raw string,
        raw string can be multiple line,
            or have an indent.
    """.trimIndent()
    println(str2)

    // string interpolation
    println("My name is ${str1 + "..."}")
    println("3 x 5 = ${3 * 5}")
}