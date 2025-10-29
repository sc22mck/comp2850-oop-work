// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: Int = 6, dieCount: Int = 1) {
    if (sides > 0){
        println("Rolling $dieCount d$sides ")

        for (i in 1..dieCount){
            val result = Random.nextInt(1, sides + 1)
            println("dieCount $i: $result")
        }
    } else {
        println("Error: cannot have a $sides-sided die")
    }

}

fun main(){
    rollDice(6)
    rollDice()
    rollDice(20,4)
    }

