package com.kotlin.controlflow

fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
}

// 1. if is an expression here: it returns a value.