// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: Int = [6], Die: Int = [1]]){
    if (sides in setOf(6,)){
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
        println("You rolled $result")
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
    fun main(){
        rollDice(6)
        rollDice()
        rollDice()
    }
}
