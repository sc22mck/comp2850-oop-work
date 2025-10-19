// Task 4.5: summing odd integers with a for loop
fun main(){
    println("Please enter the user specific limit: ")

  // Read input and convert to Int
    val upperLimit = readLine()?.toIntOrNull()
    
    // Validate input
    if (upperLimit == null || upperLimit < 1) {
        println("Error: Please enter a positive integer greater than 0")
        return
    }
    
    // Initialize sum as Long to handle large values
    var sum: Long = 0
    
    // Use for loop to sum odd numbers
    for (i in 1..upperLimit) {
        if (i % 2 != 0) { // Check if number is odd
            sum += i
        }
    }
        // Print the result
    println("The sum of all odd integers between 1 and $upperLimit is: $sum")
    
 }
    



