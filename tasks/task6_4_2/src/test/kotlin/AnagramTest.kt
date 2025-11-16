// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    // Write your unit tests here!
    //A test to check the string lenghth for both anagrams is equal
   "Anagrams must have an equal length" {
    "Anagrams".anagramOf("Anagram") shouldBe false
    "abc".anagramOf("abcd") shouldBe false
    "Hot".anagramOf("Hotter") shouldBe false
    "".anagramOf("xyz") shouldBe false
   }
   "An empty string isn't an anagram of itself"{
    "".anagramOf("") shouldBe false
   }
   "A non-empty string is an anagram of itself" {
    "helloworld".anagramOf("helloworld") shouldBe true
    "Hannah".anagramOf("Hannah") shouldBe true
    "True".anagramOf("True") shouldBe true
    "False".anagramOf("False") shouldBe true
   }
   "Two Strings are anagrams if they have the same characters in different orders." {
    "tea".anagramOf("eat") shouldBe true
    "elvis".anagramOf("lives") shouldBe true
    "arm".anagramOf("ram") shouldBe true
    "bard".anagramOf("brad") shouldBe true
   }
   "Lowercase and Uppercase forms of a character are equivalent"{
    "helloworld".anagramOf("HelLoWORLD") shouldBe true
    "true".anagramOf("TRUE") shouldBe true
    "TEST".anagramOf("test") shouldBe true
    "Fire".anagramOf("fIre") shouldBe true
   }
    
})
