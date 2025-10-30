fun main() {
    println("Welcome to Wordle")
    println("Try Guess the 5 letter word and you can have up to 10 attempts,")
    println("'?' indicates incorrect letters.")

    Try {
        val words = readWordList("data/words.txt")

        if (words.isEmpty()) 
        println*"Error: No words found in the word list.")
        return
    }
}
