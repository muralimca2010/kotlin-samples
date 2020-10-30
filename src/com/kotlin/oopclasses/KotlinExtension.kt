package com.kotlin.oopclasses


fun main() {
    class Example {
        fun printFunctionType() { println("Class method") }
    }

    fun Example.printFunctionType() { println("Extension function") }

    Example().printFunctionType()




    fun Example.printFunctionType(i: Int) { println("Extension function") }

    Example().printFunctionType(1)
}
