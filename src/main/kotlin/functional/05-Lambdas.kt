package functional

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // with lambda expression find the element that have max age
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age)) // method reference

    // variable lambda value
    val sum = { x: Int, y: Int -> x + y  }
    println(sum(1,2))

}

