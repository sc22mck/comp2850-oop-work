fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main() {
    val text = "Naruto and Sasuke are part of Team 7!"
    println("Original text: '$text'\n")

    //Count 
    val whiteSpaces = text.howMany { it.isWhitespace() }
    println("-Whitespace count : $whiteSpaces")

    //Count 
    val characterCount = text.howMany { it.isLetter() }
    println("- Letter Count: $characterCount")

    //Count 
    val digitsCount = text.howMany { it.isDigit() }
    println("- Dogot Count: $digitsCount")

    //Count 
    val vowelsCount = text.howMany { char -> 
        char.lowercaseChar() in setOf('a','e','i','o','u')
        }
    println("-Vowel Count: $vowelsCount")

    //Count punctuation
    val punctuationCount = text.howMany { it in "!@#$%^&*()_-+=[]{}|;:,.<>?" }
    println("Punctuation count: $punctuationCount")
}