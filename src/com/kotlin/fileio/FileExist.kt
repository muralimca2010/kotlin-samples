package com.kotlin.fileio

import java.io.File
fun main() {
    val filename = "cherchertech.txt"
    var fileObject = File(filename)
    var fileExists = fileObject.exists()
    if(fileExists){
        print("$filename file does exist.")
    } else {
        print("$filename file does not exist.")
    }
}