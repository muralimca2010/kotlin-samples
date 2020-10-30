package com.kotlin.introduction.datatypes

fun main() {

    val names = arrayOf("Test1", "Test2", "Test3")

    val longs1 = arrayOf(13L, 32L, 83L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val longs3 = arrayOf(1, 2, 3, 4)

    val evenNumbersArray = Array(20) { i -> i * 2 }

    for (number in evenNumbersArray) {
        println("Even Number  $number")
    }





}


