package com.kotlin.fileio

import java.io.File
fun main() {
    val file = File("chercher tech.txt")
    val bufferedReader = file.bufferedReader()
    val text:List<String> = bufferedReader.readLines()
    for(line in text){
        println(line)
    }
}