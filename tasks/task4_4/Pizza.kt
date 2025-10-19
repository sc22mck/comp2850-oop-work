fun main(){
    println("Pizza Menu")
    println()
    println("(a). Margherita")
    println("(b). Quattro Stagioni")
    println("(c). Seafood")
    println("(d). Hawaiian")
    println()
   
   var userinput: String
   
    print("Choose your pizza (a-d):")
    userinput = readln().lowercase()

    while (userinput.length != 1 || userinput[0] !in 'a'..'d'){
    print("Invalid Choice: Please select from a to d: ")
    userinput = readln().lowercase()
    }
    println("The Order has been Accepted")
}