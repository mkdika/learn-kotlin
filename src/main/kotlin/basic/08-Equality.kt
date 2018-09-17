package basic

import java.io.File

fun main(args: Array<String>) {
    val a = File("/mobydick.doc")
    val b = File("/mobydick.doc")
    val sameRef = a === b
    val structural = a == b

    println("Is same reference? $sameRef")
    println("Is same structural? $structural")

    val str1 = "maikel"
    val str2 = "maikel"
    println("Is 'maikel' & 'maikel' same reference? ${str1 === str2}")
    println("Is 'maikel' & 'maikel' same structural? ${str1 == str2}")

}