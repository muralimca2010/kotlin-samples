package com.kotlin.controlflow.ifexpression

fun main() {

    val number = 0

    val result = if (number > 0) {
        println("Positive number");
        "Positive number"
        //println("Positive number");
    } else if (number ==0) {
        println("Zero number")
        "Zero number"
    } else {
        println("Negative number")
        "Negative number"
        //println("Negative number")
    }

    println("result "+result)
    val result2 = if (number>0) "Positive number" else "Negative number"
    println("result2 "+result2)
}