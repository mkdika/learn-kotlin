package basic

data class Personx(val id:Int, val name:String, val age:Int)

fun main(args: Array<String>) {
    val personx = Personx(name="Jon Snow", age=23, id=1)

    // Destructuring
    val(id,name,age) = personx

    // print each variable value
    println("id : $id")
    println("name : $name")
    println("age : $age")

}