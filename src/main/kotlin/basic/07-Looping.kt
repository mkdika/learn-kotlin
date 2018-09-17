package basic

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,1)
    for (k in list) {
        print("$k ")
    }
    println()

    val set = setOf(1,2,3,4,1)
    for (k in set) {
        print("$k ")
    }
    println()

    val oneToTen = 1..10
    for (k in oneToTen) {
        print("$k ")
    }
    println()

    oneToTen.forEach{print("$it ")}
    println()

    val string = "print my characters"
    for(c in string) {
        print("$c ")
    }
    println()

    var i = 0
    while (i < 10) {
        print("$i ")
        i += 1
    }

}