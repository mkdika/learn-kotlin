package basic

data class Student(
        val email: String = "",
        val firstName: String = "",
        val lastName: String = "-",
        val yearOfStudy: Int
) {
    override fun toString(): String {
        return """
            E-mail       : $email
            First Name   : $firstName
            Last Name    : $lastName
            Year of Study: $yearOfStudy

        """.trimIndent()
    }
}

fun main(args: Array<String>) {
    val maikel = Student(
            firstName = "Maikel",
            lastName = "Chandika",
            email = "mkdika@gmail.com",
            yearOfStudy = 2001)

    val budi = Student(
            firstName = "Budi",
            email = "budiman@gmail.com",
            yearOfStudy = 2007)

    println(maikel)
    println(budi)

    val mike = maikel.copy()
    println(mike)

    println("Is maikel == mike? ${maikel == mike}")
    println("Is maikel === mike? ${maikel === mike}")
    println("Is mike === mike? ${mike === mike}")

}