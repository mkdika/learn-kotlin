package basic

import java.lang.IllegalStateException

enum class Grade {A,B,C,D}

/**
 * Combine usage of range and when
 */

// KOTLIN
fun computeGrade(score: Int): Grade =
        when (score) {
            in 90..100 -> Grade.A
            in 75 until 90 -> Grade.B
            in 60 until 75 -> Grade.C
            in 0 until 60 -> Grade.D
            else -> throw IllegalStateException("Wrong score value!")
        }

fun main(args: Array<String>) {
    println("Score 90, grade is ${computeGrade(90)}")
    println("Score 75, grade is ${computeGrade(75)}")
    println("Score 63, grade is ${computeGrade(63)}")
    println("Score 1, grade is ${computeGrade(1)}")
}