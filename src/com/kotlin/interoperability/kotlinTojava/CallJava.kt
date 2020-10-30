import com.kotlin.interoperability.kotlinTojava.Car


fun main() {

    val car = Car("yellow", "Benz", 2015)
    car.color = "white"
    println(car)

    car.variableMethod(5, "hi", "byerdf")
    val strings = arrayOf("dsfjsdf", "dsfrireji3o")
    car.variableMethod(10, *strings)

    car.getIntArray(intArrayOf(1, 2, 3))

    println(Car.xString())



}