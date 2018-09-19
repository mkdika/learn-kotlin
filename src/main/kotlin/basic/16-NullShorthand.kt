package basic

import java.io.File

fun main(args: Array<String>) {

    val files = File("Test").listFiles()

    // if null shorthand
    println(files?.size)

    // if not null and else shorthand
    println(files?.size ?: "empty")

}