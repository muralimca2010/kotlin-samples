package com.kotlin.controlflow.range

fun main() {
    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 3
        print(i)
    }
    print(" ")

}

/*
1. Iterates over a range starting from 0 up to 3 (inclusive).
2. Iterates over a range with a custom increment step for consecutive elements.
3. Iterates over a range in reverse order.*/
