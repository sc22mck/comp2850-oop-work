// Task 5.2.1: geometric properties of circles
import kotlin.math.print

fun circleArea(radius : Double) = PI * radius * radius

//function to calculate the the circumference(perimeter)
fun circlePerimeter(radius : Double) = 2 * PI * radius

//third function displaying a prompt to users
fun readDouble(prompt : String) {
    print(prompt)
    val prompt = readLine() ?: ""
    return prompt!!.toDouble()
}

//The main function
fun main(){
    println("")
}
