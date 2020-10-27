package com.kotlin.introduction

fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main() {
    println(describeString(null))
}



/*
1. A function that takes in a nullable string and returns its description.
2. If the given string is not null and not empty, return information about its length.
3. Otherwise, tell the caller that the string is empty or null.*/
