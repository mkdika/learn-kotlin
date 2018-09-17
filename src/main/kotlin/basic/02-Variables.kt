package basic

fun main(args: Array<String>) {
    val name = "Maikel"
    println(name)
//    name = "Max" // will be error cause val is immutable
    var age = 30   // var is mutable, can be replace after declare
    println(age)
    age = 35
    println(age)
}
