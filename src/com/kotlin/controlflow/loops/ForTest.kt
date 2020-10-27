package com.kotlin.controlflow.loops

fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}


//Loops through each cake in the list.