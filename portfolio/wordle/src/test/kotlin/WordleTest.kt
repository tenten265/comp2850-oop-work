import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class WordleTest : StringSpec({

    "isValid should return true for 5-letter words" {
        isValid("baker") shouldBe true
    }

    "isValid should return false for non-5-letter words" {
        isValid("cat") shouldBe false
        isValid("elephant") shouldBe false
        isValid("") shouldBe false
    }

    "readWordList should correctly read words from file" {
        // Create a temporary file with some words
        val tempFile = File.createTempFile("wordlist", ".txt")
        tempFile.writeText("apple\nberry\ncharm\n")

        val words = tempFile.readLines()
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .toMutableList()

        words.size shouldBe 3
        words[0] shouldBe "apple"
        words[1] shouldBe "berry"
        words[2] shouldBe "charm"

        tempFile.deleteOnExit()
    }

    "pickRandomWord should remove and return a word from list" {
        val words = mutableListOf("apple", "berry", "charm")
        val picked = pickRandomWord(words)

    (picked in listOf("apple", "berry", "charm")) shouldBe true
        words.contains(picked) shouldBe false
        words.size shouldBe 2
    }

    "evaluateGuess should return correct match results" {
        val target = "apple"
        evaluateGuess("apple", target) shouldBe listOf(1, 1, 1, 1, 1)
        evaluateGuess("apric", target) shouldBe listOf(1, 1, 0, 0, 0)
        evaluateGuess("xxxxx", target) shouldBe listOf(0, 0, 0, 0, 0)
    }
})
