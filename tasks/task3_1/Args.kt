// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(args: Array<String>){
    //check if the arguments are provided are less than 2
    if(args.size < 2){
        //terminate if arguments aren't enough
        exitProcess(1)
    }
    println(args[0])
    println(args[1])
}
    
