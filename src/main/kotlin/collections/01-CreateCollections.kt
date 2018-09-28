package collections

/**
 * Creating collections
 */
fun main(args: Array<String>) {

    val set = hashSetOf(1,7,53)
    set.forEach{print("$it ")}
    println()
    println(set)

    println()
    val list = arrayListOf(1,7,53)
    list.forEach{print("$it ")}
    println()
    println(list)

    println()
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)
    println()
    println("Elements of map:")
    map.forEach{k,v -> println("\t${k} -> ${v}")}

}