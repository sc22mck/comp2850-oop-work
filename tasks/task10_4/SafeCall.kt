// Task 10.3.2: another example of an explicit null check

fun printReversed(text: String?) {
    println("Result: ${text?.reversed()?.uppercase() ?: "null"}")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}
