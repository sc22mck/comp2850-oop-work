
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.assertions.throwables.shouldThrow
import java.io.File

class WordleTest : StringSpec({
    
    // isValid() Tests
    
    "isValid should return true for valid 5-letter words" {
        isValid("brown") shouldBe true
        isValid("olive") shouldBe true
        isValid("cocoa") shouldBe true
        isValid("words") shouldBe true
        isValid("holly") shouldBe true
    }
    
    "isValid should return false for invalid words" {
        isValid("") shouldBe false
        isValid("abc") shouldBe false
        isValid("superman") shouldBe false
        isValid("12345") shouldBe false
        isValid("bang!") shouldBe false
    }
    
    // readWordList() Tests 
    
    "readWordList should read words from file" {
        val testFile = File.createTempFile("test", ".txt")
        testFile.writeText("hello\nworld\napple\nbrave\ncloud")
        
        val words = readWordList(testFile.absolutePath)
        words shouldHaveSize 5
        words shouldContain "hello"
        words shouldContain "world"
        words shouldContain "apple"
        words shouldContain "brave"
        words shouldContain "brown"
        
        testFile.delete()
    }
    
    "readWordList should trim and lowercase words" {
        val testFile = File.createTempFile("test2", ".txt")
        testFile.writeText("  HELLO  \n  World  \n  APPLE  ")
        
        val words = readWordList(testFile.absolutePath)
        words shouldHaveSize 3
        words shouldBe listOf("hello", "world", "apple")
        
        testFile.delete()
    }
    
    // pickRandomWord() Tests 
    
    "pickRandomWord should remove word from list" {
        val words = mutableListOf("apple", "brave", "cloud")
        val originalSize = words.size
        
        val chosen = pickRandomWord(words)
        words shouldHaveSize (originalSize - 1)
        
        // Check the chosen word is no longer in the list
        (chosen in words) shouldBe false
    }
    
    "pickRandomWord should throw exception for empty list" {
        val emptyList = mutableListOf<String>()
        shouldThrow<IllegalStateException> {
            pickRandomWord(emptyList)
        }
    }
    
    //  evaluateGuess() Tests 
    
    "evaluateGuess should return correct matches" {
        evaluateGuess("hello", "hello") shouldBe listOf(1, 1, 1, 1, 1)
        evaluateGuess("hello", "world") shouldBe listOf(0, 0, 0, 1, 0)
        evaluateGuess("abcde", "axcye") shouldBe listOf(1, 0, 1, 0, 1)
        evaluateGuess("aaaaa", "bbbbb") shouldBe listOf(0, 0, 0, 0, 0)
    }
    
    "evaluateGuess should throw exception for wrong length" {
        shouldThrow<IllegalArgumentException> {
            evaluateGuess("long", "longer")
        }
    }
})
