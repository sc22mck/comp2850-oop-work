import java.io.File

// Implement the six required functions here

//A function to check that the provided word is 5 letters long
fun isValid(word: String): Boolean {
    return word.length == 5 && word.all { it.isLetter() }
}

// Reads words from a specified file and returns them as strings
fun readWordList(filename: String): MutableList<String> {
    return File(filename).readLines().toMutableList()
}

//Choose a random word from the given list
fun pickRandomWord(words: MutableList<String>): String {
    if (words.isEmpty()) {
        throw IllegalStateException("Word List empty")
    }
    val randomIndex = (0 until words.size).random()
    return words.removeAt(randomIndex)
}

//Prints a prompt using given number attempt
fun obtainGuess(attempt: Int): String {
    while(true) {
        print("Attempt $attempt: ")
        val guess = readLine()?.trim()?.lowercase()
        if(guess != null && isValid(guess)) {
            return guess
        } else {
            println("Invalid guess attempt!!! Please enter a 5-letter word")
        }
    }
}

//Compare guess word to target
fun evaluateGuess(guess: String, target: String): List<Int> {
    require(guess.length == 5 && target.length == 5) {
        "Both words must be 5-letter words"
    }
    return guess.mapIndexed { index, char ->
        if (char == target[index]) 1 else 0
    }
}

// Displays the letters of a guess that match target word
fun displayGuess(guess: String, matches: List<Int>) {
    require(guess.length == 5 && matches.size == 5) { 
        "Guess must be 5 letters and matches must have 5 elements"
    }

    val display = guess.mapIndexed { index, char ->
        if (matches[index] == 1) char else '?'
    }.joinToString("")

    println(display)
}

fun main() {
    println("Welcome to Wordle")
    println("Try Guess the 5 letter word and you can have up to 10 attempts,")
    println("'?' indicates incorrect letters.")

    try {
        val words = readWordList("data/words.txt")

        if (words.isEmpty()) {
            println("Error: No words found in the word list.")
            return
        }
        
        //return random word
        val targetWord = pickRandomWord(words)

        var attempt = 1
        var guessedCorrectly = false

        //loop
        while (attempt <= 10 && !guessedCorrectly) {
            val guess = obtainGuess(attempt)

            if (guess == targetWord) {
                guessedCorrectly = true
                println("Success! You guessed the word '$targetWord' right!")
            } else {
                val matches = evaluateGuess(guess, targetWord)
                displayGuess(guess, matches)
                attempt++
            }
        }

        if (!guessedCorrectly){
            println("Game over! The right word was '$targetWord'. Try again next time!")
        }
    } catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }
}