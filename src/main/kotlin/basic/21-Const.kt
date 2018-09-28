package basic

class Kalkulator {
    companion object {
        /*
        Const Val modifier is equals to Java's: public static final
         */
        const val PHI = 3.143
    }
}

fun main(args: Array<String>) {
    println(Kalkulator.PHI)
}