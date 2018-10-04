package coroutine

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

suspend fun doWorld() = delay(2000L).apply {print("World!")}

fun main(args:Array<String>) = runBlocking {
    launch{ doWorld()}
    print("Hello, ")
}
