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

// multiple inheritance
open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}

