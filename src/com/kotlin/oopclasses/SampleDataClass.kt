
data class UserData(val uName: String, var uAge: Int)

fun main() {
    val velan = UserData("Velan", 1)
    println("User Name : ${velan.uName}")
    println("User Age : ${velan.uAge}")

    //Copy
    val copyVelan = velan.copy()

    println("Copied Object : ${copyVelan.uName}")

    //Copy with Change value
    val copyObjectValueChange = velan.copy("Kumaran", 6)
    println("UserName: ${copyObjectValueChange.uName} , UserAge: ${copyObjectValueChange.uAge}")


    // hashCode ==
    if (velan.uName.hashCode() == copyVelan.uName.hashCode()) {
        println(velan.uName.hashCode())
        println(copyVelan.uName.hashCode())
        println("Both same")
    } else {
        println("Not same")
    }

    // hashCode equals()
    if (velan.uName.hashCode().equals(copyObjectValueChange.uName.hashCode())) {
        println(velan.uName.hashCode())
        println(copyObjectValueChange.uName.hashCode())
        println("Both same")
    } else {
        println(velan.uName.hashCode())
        println(copyObjectValueChange.uName.hashCode())
        println("Not same")
    }

    //toString()
    val velantoString = velan.copy(velan.uAge.toString(), 12)
    println("UserName: ${velantoString.uName}, UserAge: ${velantoString.uAge}")

    //componentN
    println("UserName: ${velantoString.component1()}, UserAge: ${velantoString.component2()}")

}



/*
Kotlin Data Class Requirements
Here are the requirements:

The primary constructor must have at least one parameter.
The parameters of the primary constructor must be marked as either val (read-only) or var (read-write).
The class cannot be open, abstract, inner or sealed.
The class may extend other classes or implement interfaces. If you are using Kotlin version before 1.1, the class can only implement interfaces.*/

/*
For this class, the compiler automatically generates:

copy() function, equals() and hashCode() pair, and toString() form of the primary constructor
componentN() functions*/
