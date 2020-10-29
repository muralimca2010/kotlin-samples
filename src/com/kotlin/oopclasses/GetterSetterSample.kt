package com.kotlin.oopclasses

fun main(args: Array<String>) {

    val anitha = Girl()
    anitha.actualAge = 15
    anitha.age = 15
    println("Anitha: actual age = ${anitha.actualAge}")
    println("Anitha: pretended age = ${anitha.age}")

    val priya = Girl()
    priya.actualAge = 35
    priya.age = 35
    println("Priya: actual age = ${priya.actualAge}")
    println("Priya: pretended age = ${priya.age}")
}

class Girl {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}