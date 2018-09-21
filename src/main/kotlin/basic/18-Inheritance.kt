package basic

// by default implicit inherit from Any
class Example

// inherit from custom class
// must use syntax open to allow class to be inherited
// default all classes are final and can not be inherited
open class Base(p: Int) {
    open val x: Int = 12

    open fun v() {

    }
    fun nv() {

    }
}

class Derived(p: Int): Base(p) {
    override val x: Int = 23

    // overriding method
    override fun v() {

    }
}

