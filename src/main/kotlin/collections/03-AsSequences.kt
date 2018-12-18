package collections

import kotlin.streams.toList

/**
 * Sequences
 *
 * Use sequence for bigger collections with more than one
 * processing step, instead of Iterable (list, array, etc.)
 *
 */

fun main(args: Array<String>) {

    val people = listOf(Person("Alice",27),
            Person("Bob", 31),
            Person("Carol", 31),
            Person("Andy", 20),
            Person("Acung", 45))

    // More than one step intermediate processing
    val peopleA = people.asSequence()
            .map { it.name }
            .filter { it.startsWith("A") }
            .sorted()
            .toList()
    println(peopleA)

    // use java8 stream
    // with same intermediate operation
    val peopleB = people.stream()
            .map { it.name }
            .filter{ it.startsWith("A")}
            .sorted()
            .toList()
    println(peopleB)


}