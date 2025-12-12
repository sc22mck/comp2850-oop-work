import java.io.File
import kotlin.random.Random

//constants
const val WORD_LENGTH = 5
const val MAX_ATTEMPTS = 10

//A function to check that the provided word is 5 letters long
fun isValid(word: String): Boolean {
    return word.length == WORD_LENGTH && word.all { it.isLetter() }
}

// Reads words from a specified file and returns them as strings
fun readWordList(filename: String): MutableList<String> {
    return File(filename).readLines().map { it.trim().lowercase() }.toMutableList()
}

//Choose a random word from the given list
fun pickRandomWord(words: MutableList<String>): String {

 check(words.isNotEmpty()) {"Word list empty!!!"}

    val randomIndex = Random.nextInt(words.size)
    return words.removeAt(randomIndex)
}

//Prints a prompt using given number attepmt
fun obtainGuess(attempt: Int): String {
    while (true) {
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
    require(guess.length == WORD_LENGTH && target.length == WORD_LENGTH) {
        "Both guess and target must be 5-letter words"
    }
    return guess.mapIndexed { index, char ->
        if (char == target[index]) 1 else 0
    }
}

//  Displays the letters of a gues that match target word
fun displayGuess(guess: String, matches: List<Int>) {
    require(guess.length == WORD_LENGTH && matches.size == WORD_LENGTH) { 
        "Guess must be 5 letters and matches must have 5 elements"
    }
    
    val display = guess.mapIndexed { index, char ->
        if (matches[index] == 1) char else '?'
    }.joinToString("")
    
    println(display)
}
