import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

//constant for attempts
const val MAX_ATTEMPTS = 10

fun main() {
    println("Welcome to Wordle")
    println("Try Guess the 5 letter word and you can have up to 10 attempts,")
    println("'?' indicates incorrect letters.")

    // Read word list with error handling - only 2 return statements total
    val words = try {
        readWordList("data/words.txt")
    } catch (e: FileNotFoundException) {
        println("Error: Could not find data/words.txt file - ${e.message}")
        return  // 1st return
    } catch (e: IOException) {
        println("Error reading file: ${e.message}")
        return  // 2nd return - ONLY 2 RETURNS!
    }

    // Check if word list is empty - NO RETURN HERE!
    if (words.isEmpty()) {
        println("Error: No words found in the word list.")
        // Don't return - just let the program end naturally
    } else {
        // Pick random word
        val targetWord = pickRandomWord(words)

        var attempt = 1
        var guessedCorrectly = false

        // Game loop (max 10 attempts)
        while (attempt <= MAX_ATTEMPTS && !guessedCorrectly) {
            val guess = obtainGuess(attempt)

            // Check if guess is correct
            val matches = evaluateGuess(guess, targetWord)
            displayGuess(guess, matches)
            
            if (matches.all { it == 1 }) {
                guessedCorrectly = true
                println("Success! You guessed the word '$targetWord' right!")
            } else {
                attempt++
            }
        }

        // Game over message
        if (!guessedCorrectly) {
            println("Game over! The right word was '$targetWord'. Try again next time!")
        }
    }
}
