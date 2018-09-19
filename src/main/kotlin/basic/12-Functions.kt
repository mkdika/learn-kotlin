package basic

fun sum(a: Int, b:Int):Int {
    return a + b
}

fun sum2(a: Int, b:Int) = a + b

fun sayHello(name: String) = println("Your name is $name") // void or unit in Kotlin

fun sayBye(name: String): Unit { // Unit explicit is optional
    println("Goodbye is $name")
}

fun main(args: Array<String>) {
    println(sum(2,3))
    println(sum2(8,7))
    sayHello("Max")
    sayBye("John Doe")
}