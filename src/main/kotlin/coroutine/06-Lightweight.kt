package coroutine

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking {
    repeat(100_000) {i ->
        launch {
            delay(1000L)
            println("$i .")
        }
    }
}