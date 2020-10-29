package com.kotlin.oopclasses

class OuterErr {
    val oVal= "Outside the nested calss"
    inner class Nested {
        val nVal = "Inside the nested class"
        fun showMe() = oVal
    }
}
fun main(){
    val outer = OuterErr()
    println(outer.Nested().showMe())
}