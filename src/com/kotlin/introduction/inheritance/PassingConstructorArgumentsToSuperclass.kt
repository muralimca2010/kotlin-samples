package com.kotlin.introduction.inheritance

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1

fun main() {
    val lion: Lion = Asiatic("Rufo")                              // 2
    lion.sayHello()
}


/*
1. name in the Asiatic declaration is neither a var nor val: it's a constructor argument, whose value is passed to the name property of the superclass Lion.
2. Creates an Asiatic instance with the name Rufo. The call invokes the Lion constructor with arguments Rufo and India.*/
