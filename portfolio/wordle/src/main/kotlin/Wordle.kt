import java.io.File
// Implement the six required functions here

//A function to check that the provided word is 5 letters long
fun isValid(word: String): Boolean {
    return word.length == 5 && word.all { it.isLetter() }
}

// Reads words from a specified file and returns them as strings
fun readWordList(filename: String): MutableList <String>{
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

//Prints a prompt using given number attepmt
fun obtainGuess(attempt: Int): String {
    while(true) {
        print("Attempt $attempt: ")
        val guess = readLine()?.trim()?.lowercase()
        if(guess != null && isValid(guess)) {
            return guess
        } else {
            println("Invalid guess attempt!!! Please enter a 6-letter word")
        }
    }
}
//Compare guess word to target
fun evaluateGuess(guess: String, target: String): List<Int> {
    require(guess.length == 5 && target.length == 5) {
        "Both targets must be 5-letter words"
    }
    return guess.mapIndexed { index, char ->
    if (char == target[index]) 1 else 0
    }
}
//  Displays the letters of a gues that match target word
 fun displayGuess(guess: String, matches: List<Int>) {
    require(guess.length == 5 && matches.size == 5) { "Guess must be 5 letters and matches must have 5 elements"}

    val display = guess.mapIndexed { index, char ->
        if (matches[index] == 1) char else '?'
        }.joinToString("")

        println(display)
 }