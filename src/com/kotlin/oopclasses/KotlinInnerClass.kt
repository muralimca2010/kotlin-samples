package com.kotlin.oopclasses

class OuterClass {

    val a = "Outside Nested class."

    inner class Inner {
        fun showMe() = a
    }
}

fun main(args: Array<String>) {

    val outer = OuterClass()
    println("Using outer object: ${outer.Inner().showMe()}")

    val inner = OuterClass().Inner()
    println("Using inner object: ${inner.showMe()}")
}