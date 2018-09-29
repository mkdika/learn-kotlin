package collections

data class Person(val name: String, val age: Int)

class Book(val title:String, val authors: List<String>)

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)

    // filter with predicate/boolean expression
    println(list.filter{it %2 == 0})

    // map, to transform collection into new form/result
    println(list.map{ it * it})
    val people = listOf(Person("Alice",27),
                        Person("Bob", 31),
                        Person("Carol", 31))
    println(people.map { it.name })
    val oldest = people.filter { it.age > 30 }.map(Person::name)
    println(oldest)

    // all to check if all element fulfill the criteria/ predicate
    val canBeInClub27 = {p:Person -> p.age <= 27}
    println(people.all(canBeInClub27))

    // any to check if all element have at least one element to fulfill the criteria
    println(people.any(canBeInClub27))

    // count is use to check how many elements satisfy the predicate
    println(people.count(canBeInClub27))

    // group by is use to converting a list to a map of groups
    println(people.groupBy{ it.age })

    // flatmap is use to processing elements in nested collections
    val strings = listOf("abc","def")
    println(strings.flatMap {it.toList()})

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                       Book("Mort", listOf("Terry Pratchett")),
                       Book("Good Omens", listOf("Terry Pratchett","Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())
}