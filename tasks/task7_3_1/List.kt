// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
   
    println(numbers)
    println(numbers[0])// prints the first value in the list
    println(numbers.get(0))// Uses the get to print the first value
   
    // println(numbers[10])
    println(numbers.slice(2..4))// Only prints the 2 to 4 values in the list
    println(numbers.first)
    println(numbers.last)

    numbers.add(1)
}