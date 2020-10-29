package com.kotlin.controlflow.trycatch

import java.io.IOException

fun main(args: Array<String>) {
    val a = 6
    val b = 0
    var c : Int

    try {
        c = a/b
        print(c)
    } catch (e : IOException){
        println("An IOException occurred. Please Handle.")
    } catch (e : Exception){
        println("An Exception occurred. Handle.")
    }
}
