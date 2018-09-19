package basic

data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {
    val cust = Customer("Maikel","mkdika@gmail.com")
    println("Customer Name : ${cust.name}")
    println("Customer Email: ${cust.email}")
}