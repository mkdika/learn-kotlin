package basic

// normal class
class Invoice {
}

// class without body, curly braces are optional
class Empty

// class with primary constructor
class Person(firstName: String) {
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    // init block for primary constructor logic
    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

}

// class with multi constructor
class Orang(val name: String) {
    constructor(name: String, parent: Orang) : this(name) {
        parent.name.also(::println)
    }
}

fun main(args: Array<String>) {
    val demo = InitOrderDemo("Maikel")
}
