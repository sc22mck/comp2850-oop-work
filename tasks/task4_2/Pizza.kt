fun main(){
    println("Pizza Menu")
    println()
    println("(a). Margherita")
    println("(b). Quattro Stagioni")
    println("(c). Seafood")
    println("(d). Hawaiian")
    println()
    print("Choose your pizza (a-d):")

    val userinput = readln().lowercase()

    val result = if(userinput.length == 1 && userinput[0] in 'a'..'d'){
        "Order Accepted"
    } else {
        "Order Invalid!!!"
    }


    println(result)
}