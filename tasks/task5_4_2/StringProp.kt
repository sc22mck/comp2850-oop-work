 // Task 5.4.1: string extension function

//String function extension 
val String.tooLong: Boolean get() = this.length > 20

//Function Test
fun main() {
    print("Enter a string: ")
    val input = readln()

    if (input.tooLong){
        println("String too long! (${input.length})")
    } else {
        println("String length is acceptable")
    }
}