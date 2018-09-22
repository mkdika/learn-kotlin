package functional

// demo of function creation and usage

fun double(x: Int): Int {
    return 2 * x
}

// default argument value, with single expression functions
fun volume(len: Int, width:Int = 10): Int = len * width


// named argument
fun person(title:String = "Mr", firstName:String, lastName:String, gender:String = "Male"):String {
    return """
        $title. $firstName $lastName is $gender
    """.trimIndent()
}


fun main(args: Array<String>) {
    val result = double(2)
    println(result)

    println(volume(5))
    println(volume(5,3))

    val maikel = person(firstName = "Maikel",lastName = "Chandika",title = "Sir")
    println(maikel)
}

