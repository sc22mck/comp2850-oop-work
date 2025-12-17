// Task 8.3: functions for temperature analysis

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> {
  // Create and return a simulated dataset here
  // Use the listOf() and to() functions to create the dataset
  return listOf(
    "Leeds West Station" to -3.0,
    "London Central Station" to 21.4,
    "Sheffield Station" to 15.0,
    "Liverpool Station" to 11.5,
    "Birmingham Station" to 3.5,
  )
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
