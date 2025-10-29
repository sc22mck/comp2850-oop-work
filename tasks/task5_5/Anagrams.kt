// Task 5.1.1: anagram checking using a function
infix fun String.anagramOf(second: String): Boolean {
    if (this.length != second.length) {
        return false
    }
    val thisChars = this.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return thisChars == secondChars
}

fun main() {
    println("Enter your first anagram: ")
    val anag1 = readLine() ?: ""
    println("Enter your second anagram: ")
    val anag2 = readLine() ?: ""
    println(anag1 anagramOf anag2)
}