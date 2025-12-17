// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    val dataset = fetchData()

    //   - Find records with lowest and and highest temperatures
    val lowRecord = dataset.minByOrNull { it.second } 
    val hiRecord = dataset.maxByOrNull { it.second }
    
    //   - Compute average temperature
    val averageTemp = dataset.map { it.second }.average()

    //Display the dataset 
    println("All temperature readings:")
    dataset.forEach { record ->
    println("  ${record.first}: ${record.second}°C")
    }
    println()

    //   - Display all of these statistics
    if (lowRecord != null) {
        println("Lowest Recorded Temperature: ${lowRecord.first} , ${lowRecord.second}°C")
    }
    if (hiRecord != null) {
        println("Highest temperature: ${hiRecord.first} , ${hiRecord.second}°C")
    }
    
    println("Average temperature: ${"%.2f".format(averageTemp)}°C")
}

