package basic

fun main(args: Array<String>) {
    var str1: String? = null
    //var str2: String = null // will cause compile time error
    println(str1)
    println(str1?.length)
    str1 = "Maikel"
    println(str1?.length)


    var number:Int  = 123
    // number = null // will cause compile time error
    println(number)


}