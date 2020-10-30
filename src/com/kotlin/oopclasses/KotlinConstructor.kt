package com.kotlin.oopclasses

fun main() {

    val emp = Manager("Priya")
    println(emp.name)
    emp.isQualified = false
    println(emp.isQualified)

    val emp2 = Manager("Anitha")
    println(emp2.name)
    println(emp2.isQualified)

    println(DemoClass().dummy)

}

class Manager(var name: String, isQualified: Boolean = false) {

    var isQualified = isQualified
        get() {
            println("Get Value")
            return field
        }
        set(value) {
            println("Set Value")
            field = value
        }

}

class DemoClass(var dummy: String = "Test") {
}


