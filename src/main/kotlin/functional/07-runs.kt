package functional

fun test() {
    var mood = "I am sad"

    // create separated local scope
    run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad
}

fun main(args: Array<String>) {
    test()
}