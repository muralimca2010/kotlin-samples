package com.kotlin.collections

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun main() {
    val stringList = listOf("ram", "som", "jam")
    printAll(stringList)

    val stringSet = setOf("jam", "som", "ram")
    printAll(stringSet)
}