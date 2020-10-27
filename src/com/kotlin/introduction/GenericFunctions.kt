package com.kotlin.introduction

class GenericFunctions<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "com.Introduction.MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = GenericFunctions(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}



//Note that the compiler can infer the generic type from the parameters of com.Introduction.mutableStackOf so that you don't have to write com.Introduction.mutableStackOf<Double>(...).