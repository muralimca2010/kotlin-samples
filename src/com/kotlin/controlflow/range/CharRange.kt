package com.kotlin.controlflow.range

fun main() {
    for (c in 'a'..'d') {        // 1
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    print(" ")

}


/*
1. Iterates over a char range in alphabetical order.
2. Char ranges support step and downTo as well.*/
