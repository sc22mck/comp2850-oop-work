// Task 10.1: program in which null values can occur

fun printReversed(text: String) {
    val result = text.reversed().uppercase()
    println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}
