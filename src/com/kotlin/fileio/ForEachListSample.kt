package com.kotlin.fileio

import java.io.File
fun main() {
    val file = File("cherchertech.txt")
    file.forEachLine { println(it) }
}