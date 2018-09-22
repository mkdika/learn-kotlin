package basic

class Animal {

    var stringRepresentation: String = ""
        get() = field
        set(value) {
            field + "-XYZ"
        }
}

fun main(args: Array<String>) {
    var animal = Animal()
    animal.stringRepresentation = "Tiger"
    println(animal.stringRepresentation)
}