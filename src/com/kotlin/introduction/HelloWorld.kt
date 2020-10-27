package com.kotlin.introduction

fun main() {                        // 1
    println("Hello, World!")        // 2
}



//1  An entry point to a Kotlin application is the com.functions.com.Introduction.main function. In Kotlin 1.3, you can declare com.functions.com.Introduction.main without any parameters. The return type is not specified, which means that the function returns nothing.
//2  println writes a line to the standard output. It is imported implicitly. Also note that semicolons are optional.



/*
In Kotlin versions earlier than 1.3, the com.functions.com.Introduction.main function must have a parameter of type Array<String>.
fun com.functions.com.Introduction.main(args: Array<String>) {
    println("Hello, World!")
}*/
