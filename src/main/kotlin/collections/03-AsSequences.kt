package collections


fun main(args: Array<String>) {

    val people = listOf(Person("Alice",27),
            Person("Bob", 31),
            Person("Carol", 31),
            Person("Andy", 20))

    val peopleA = people.asSequence()
            .map { it.name }
            .filter { it.startsWith("A") }
            .toList()
    println(peopleA)

}