package com.kotlin.oopclasses


fun main() {
    val s = "PriyA"
    println(s.lowerFirstAndLast())
}

fun String.lowerFirstAndLast(): String {
    val lowerFirst = substring(0, 1).toLowerCase() + substring(1)
    return lowerFirst.substring(0, lowerFirst.length - 1) +
            lowerFirst.substring(lowerFirst.length - 1, lowerFirst.length).toLowerCase()
}



