package com.kotlin.oopclasses

fun main() {

    var student = Student1("Anitha", true)
    var student11 = Student1("Priya", false)

    println(student)
}

private class Student1(name: String, isQualified: Boolean = false) {

}