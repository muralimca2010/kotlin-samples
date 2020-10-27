package com.kotlin.controlflow.range

fun main() {
    val x = 2
    if (x in 1..5) {            // 1
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }
}


/*
1. Checks if a value is in the range.
2. !in is the opposite of in.*/
