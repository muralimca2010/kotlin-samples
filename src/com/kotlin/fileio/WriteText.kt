package com.kotlin.fileio

import java.io.File
fun main() {
    val fileName = "cherchertech.txt"
    var fileObject = File(fileName)
    // create a new file
    fileObject.writeText("This is some text for file writing operations")
}