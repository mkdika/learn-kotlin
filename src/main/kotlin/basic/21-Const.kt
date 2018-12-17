package basic

class Kalkulator {
    companion object {
        /*
        Const Val modifier is equals to Java's: public static final
         */
        const val PHI = 3.143

        val GRAVITY = .98

        fun add(a: Int, b: Int) = a+b
    }
}

object  Calculator {
    const val PHI = 3.143578
}

fun main(args: Array<String>) {
    println(Kalkulator.PHI)
    println(Kalkulator.GRAVITY)
    println(Calculator.PHI)
    println(Kalkulator.add(2,8))
}