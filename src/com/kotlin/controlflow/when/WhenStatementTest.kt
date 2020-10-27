package com.kotlin.controlflow.`when`

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

class MyClass


/*
1. This is a when statement.
2. Checks whether obj equals to one.
3. Checks whether obj equals to Hello.
4. Performs type checking.
5. Performs inverse type checking.
6. Default statement (might be omitted).

Note that all branch conditions are checked sequentially until one of them is satisfied. So, only the first suitable branch will be executed.*/
