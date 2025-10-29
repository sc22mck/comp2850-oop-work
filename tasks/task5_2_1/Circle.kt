// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

//function to compute the area of a circle
fun circleArea(radius : Double) = PI * radius * radius

//function to calculate the the circumference(perimeter)
fun circlePerimeter(radius : Double) = 2 * PI * radius

//third function displaying a prompt to users
fun readDouble(prompt : String): Double {
    print(prompt)
    return readln().toDouble()
}

//The main function
fun main(){
    val radius = readDouble("Eter circle radius: ")
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)


    println("Circle radius is $radius")
    println("Area: ${"%.2f".format(area)}")
    println("Perimeter: ${"%.2f".format(perimeter)}")
}