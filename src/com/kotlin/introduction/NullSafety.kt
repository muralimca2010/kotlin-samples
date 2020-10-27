package com.kotlin.introduction

fun main() {
    var neverNull: String = "This can't be null"            // 1

//    neverNull = null                                        // 2

    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5

//    inferredNonNull = null                                  // 6

    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }

    strLength(neverNull)                                    // 8
//    strLength(nullable)                                     // 9
}



/*
1. Declares a non-null String variable.
2. When trying to assign null to non-nullable variable, a compilation error is produced.
3. Declares a nullable String variable.
4. Sets the null value to the nullable variable. This is OK.
5. When inferring types, the compiler assumes non-null for variables that are initialized with a value.
6. When trying to assign null to a variable with inferred type, a compilation error is produced.
7. Declares a function with a non-null string parameter.
8. Calls the function with a String (non-nullable) argument. This is OK.
9. When calling the function with a String? (nullable) argument, a compilation error is produced.*/
