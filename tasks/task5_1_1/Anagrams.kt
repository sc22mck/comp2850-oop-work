// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    println("Enter your first anagram: ")
    val anag1 = readLine() ?: ""
    println("Enter your second anagram: ")
    val anag2 = readLine() ?: ""
  println(anagrams(anag1, anag2))
}