// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(xprompt: String): Int {
    print(xprompt)
    val userInput = readLine()
    return userInput!!.toInt()
}

fun main() {
    val sides = readInt("Enter the number of sides for the die: ")
    rollDie(sides)
}
