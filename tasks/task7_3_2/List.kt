// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
   
    println(numbers)
    println(numbers[0])// prints the first value in the list
    println(numbers.get(0))// Uses the get to print the first value
   
    // println(numbers[10])
    println(numbers.slice(2..4))// Only prints the 2 to 4 values in the list
    println(numbers.first())
    println(numbers.last())

    //Demonstrate the add function
    numbers.add(1)
    println(numbers)

    //Demonstrate the .addAll()
    numbers.addAll(listOf(9, 10, 13, 14))
    println(numbers)

    //Demonstrate .remove()
    numbers.remove(0)
    println(numbers)

    //Demonstrate the .removeAll()
    numbers.removeAll(listOf(9, 10, 13, 14))
    println(numbers)

    //Demonstrate .removeAt()
    numbers.removeAt(3)
    println(numbers)

   //Demonstrate .clear()
   numbers.clear()
   println(numbers)
}