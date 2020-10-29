package com.kotlin.oopclasses

class Outer {
    val oVal= "Outside the nested calss"
    class Nested {
        val nVal = "Inside the nested class"
        fun showMe() = "Function show inside the nested class"
    }
}
fun main(){
    // accessing member of Outer class
    println(Outer().oVal);
    // accessing member of Nested class
    println(Outer.Nested().nVal);

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.nVal);
    println(nested.showMe())
}


