// Task 7.7.1: stats for a numeric dataset
fun readData() = buildList {
    //Print a prompt for the user
    println("Enter a floating point number -Enter a blank line to terminate-")
    //Write a loop to read the input numbers
    while (true) {
        val input = readlnOrNull()?.trim()

        //If input is empty or null 
        if (input.isNullOrEmpty()) {
            break
        }
    //Convert to a double
    val number = input.toDoubleOrNull()

    //If input can't be converted exit loop
    if (number == null) {
        break
    }
     add(number)
    }
}

//Function to calculate the median
fun median(values: List<Double>): Double {
    //sort in ascending order
    val sorted = values.sorted()

    val middle = values.size / 2

    return if (values.size % 2 == 0) {

        (sorted[middle - 1] + sorted[middle])/ 2.0
    }else {
        sorted[middle]
    }
}

fun displayStatistics(values: List<Double>) {

    // Compute minimum using list extension function
    val min = values.min()
    
    // Compute maximum using list extension function
    val max = values.max()
    
    // Compute mean (average) using list extension function
    val mean = values.average()
    
    // Compute median using our custom function
    val medianValue = median(values)
    
    // Display the statistics
    println("\nStatistics:")
    println("Minimum: $min")
    println("Maximum: $max")
    println("Mean: $mean")
    println("Median: $medianValue")

}

fun main() {

    val data =  readData()

    displayStatistics(data)
}