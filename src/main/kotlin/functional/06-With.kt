package functional

fun main(args: Array<String>) {
    println(abc())
}

fun abc():String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know my ABC")
        this.toString()
    }
}