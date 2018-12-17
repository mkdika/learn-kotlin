package basic

// varargs as parameter to others vararg :)
fun printString(vararg strings: String) {
    realPrintString(*strings) // need to put asterisk * in front of argument name
}

fun realPrintString(vararg strings: String) {
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