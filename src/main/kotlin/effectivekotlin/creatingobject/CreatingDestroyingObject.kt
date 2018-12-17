package effectivekotlin.creatingobject

import java.io.File

interface ImageReader {
    fun read(file: File): Bitmap
    companion object {
        fun newImageReader(format: String) = when (format) {
            "jpg" -> JpegReader()
            "gif" -> GifReader()
            else -> throw IllegalStateException("Unknown format")
        }
    }
}

class Bitmap {
    constructor() {
        println("Bitmap instance.")
    }
}

class JpegReader {
    constructor() {
        println("JpegReader instance.")
    }
}

class GifReader {
    constructor() {
        println("GifReader instance.")
    }
}

fun main(args: Array<String>) {
    val reader = ImageReader.newImageReader("jpg")
    val reader1 = ImageReader.newImageReader("jpgx")
}