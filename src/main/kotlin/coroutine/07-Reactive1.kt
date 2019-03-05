package coroutine

import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.experimental.channels.consumeEach
import kotlinx.coroutines.experimental.channels.produce
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking<Unit> {
    // create a channel that produces numbers from 1 to 3 with 200ms delays between them
    val source = produce<Int> {
        println("Begin") // mark the beginning of this coroutine in output
        for (x in 1..3) {
            delay(500) // wait for 200ms
            send(x) // send number x to the channel
        }
    }
    // print elements from the source
    println("Elements:")
    source.consumeEach {
        // consume elements from it
        println(it)
    }
    // print elements from the source AGAIN
    println("Again:")
    source.consumeEach {
        // consume elements from it
        println(it)
    }
}