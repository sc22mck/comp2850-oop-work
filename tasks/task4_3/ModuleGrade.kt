import kotlin.math.roundToInt

fun main(args: Array<String>){
    // Check command line arguments for three values
if (args.size != 3) {
    println("Error: Please provide exactly three marks as command line arguments")
    println("Usage: kotlin ModuleGrade.kts <mark1> <mark2> <mark3>")
    kotlin.system.exitProcess(1)
}

// Convert and validate marks
val marks = try {
    args.map { it.toInt() }
} catch (e: NumberFormatException) {
    println("Error: All marks must be valid integers")
    kotlin.system.exitProcess(1)
}

// Validate mark ranges
for (mark in marks) {
    if (mark < 0 || mark > 100) {
        println("Error: Marks must be between 0 and 100")
        kotlin.system.exitProcess(1)
    }
}

// Calculate average and determine grade
val average = marks.average().roundToInt()

val grade = when (average) {
    in 70..100 -> "Distinction"
    in 40..69 -> "Pass"
    in 0..39 -> "Fail"
    else -> "?"
}

// Print results
println("Average mark: $average")
println("Grade: $grade")
}