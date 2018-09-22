package basic

interface Bird {
    fun fly()
    fun tweet() {
        println("cuit!")
    }
}

class Eagle: Bird {
    override fun fly() {
        println("Eagle fly...")
    }

    override fun tweet() {
        super.tweet()
        println("HWAKKKK!")
    }
}

fun main(args: Array<String>) {
    val eagle = Eagle()
    eagle.fly()
    eagle.tweet()
}