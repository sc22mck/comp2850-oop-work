// Task 9.6: functions for dataset variance calculation
import java.io.File

// Add variance() function here
fun variance(dataset: List<Double>): Double {
    require(dataset.size > 1) { "not enough data" }

    val mean = dataset.average()

    var sum = 0.0
    for (value in dataset) {
        sum += (value - mean) * (value - mean)
    }

    return sum / (dataset.size - 1)
}


// Add readData() function here
fun readData(filename: String) = buildList {
    File(filename).forEachLine {
        add(it.toDouble())
    }
}

