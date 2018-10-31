package basic

fun printString(vararg strings: String) {
    for (str in strings) {
        print("$str ")
    }
    println()
}

fun main(args: Array<String>) {
    printString("1")
    printString("1","2")
    printString("1","2","3")
    printString("1","2","3","4")
}