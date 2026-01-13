// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here

    if (args.isEmpty()) {
        println("Error: no filename supplied")
        exitProcess(1)
    }

    val filename = args[0]

    try {
        val data = readData(filename)
        val varValue = variance(data)

        println("Dataset size: ${data.size}")
        println("Variance: ${"%.5f".format(varValue)}")

    } catch (e: Exception) {
        println("Error: ${e.message}")
        exitProcess(1)
    }
}
