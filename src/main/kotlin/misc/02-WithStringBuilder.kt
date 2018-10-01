package misc

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val sentence:String  = with(StringBuilder("Lorem Ipsum ")) {
        append("Dolok Margu ").append("Dolok Amet ")
        append("Dolok Saribu.")
        toString()
    }
    println(sentence)
}