import io.kotest.assertions.withClue
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.collections.shouldHaveSize

@Suppress("unused")
class WordleTest : StringSpec({
    // Use only valid 5-letter test words
    val testWord = mutableListOf("APPLE", "BERRY", "MANGO", "PEACH")
    // Use a small fixture dedicated for tests to keep expectations stable
    val fileName = "data/wordle.txt"

    // Tests for isValid function
    "isValid should return true for a valid 5-letter word" {
        withClue("Checking a standard valid word 'APPLE'") {
            isValid("APPLE") shouldBe true
        }
    }

    "isValid should return false for a word that is too short" {
        withClue("Checking 4-letter word 'FOUR'") {
            isValid("FOUR") shouldBe false
        }
    }

    "isValid should return false for a word that is too long" {
        withClue("Checking 6-letter word 'WORDLE'") {
            isValid("WORDLE") shouldBe false
        }
    }

    "isValid should return false for a word containing non-letters" {
        withClue("Checking word with numbers 'A2PLE'") {
            isValid("A2PLE") shouldBe false
        }
    }

    // Tests for readWordList function
    "readWordList should correctly filter, uppercase, and read valid words from the file" {
        val expected = mutableListOf("CRANE", "APPLE", "HELLO")
        val actualWords = readWordList(fileName)

        withClue("The list size should only contain 3 valid words") {
            actualWords shouldHaveSize 3
        }
        withClue("The words should be correctly filtered and uppercased") {
            actualWords shouldBe expected
        }
    }

    "readWordList should return an empty list if the word file does not exist" {
        val actualWords = readWordList("non_existent_file.txt")
        withClue("If the file is missing, the word list should be empty") {
            actualWords shouldHaveSize 0
        }
    }

    // Tests for pickRandomWord function
    "pickRandomWord should remove a word from the list and return it" {
        // copy the sample list so this test doesn't mutate the shared list
        val listToTest = testWord.toMutableList()
        val initialSize = listToTest.size

        val pickedWord = pickRandomWord(listToTest)

        withClue("The list size must decrease after picking a word") {
            listToTest shouldHaveSize (initialSize - 1)
        }
        withClue("The picked word '$pickedWord' must no longer be in the list") {
            listToTest.contains(pickedWord) shouldBe false
        }
    }

    "pickRandomWord should throw NoSuchElementException when called on an empty list" {
        val emptyList = mutableListOf<String>()
        shouldThrow<NoSuchElementException> {
            pickRandomWord(emptyList)
        }
    }

    // Tests for evaluateGuess function
    val target = "APPLE"

    "evaluateGuess should return [1, 1, 1, 1, 1] for a perfect match" {
        withClue("Testing guess 'APPLE' against target '$target'") {
            evaluateGuess("APPLE", target) shouldBe listOf(1, 1, 1, 1, 1)
        }
    }

    "evaluateGuess should return [0, 0, 0, 0, 1] for a guess with only last letter correct" {
        withClue("Testing guess 'GRAPE' against target '$target'") {
            evaluateGuess("GRAPE", target) shouldBe listOf(0, 0, 0, 0, 1)
        }
    }

    "evaluateGuess should return correct positional matches for a scattered guess" {
        // A T O M E vs A P P L E -> 1 0 0 0 1
        withClue("Testing guess 'ATOME' against target '$target'") {
            evaluateGuess("ATOME", target) shouldBe listOf(1, 0, 0, 0, 1)
        }
    }

})
