// Implement the six required functions 

import java.io.File

//Check if the word value == 5
fun isValid(word: String): Boolean {
    // valid if exactly 5 characters and all are letters
    return word.length == 5 && word.all { it.isLetter() }
}


// Read word from the word.txt file 
fun readWordList(filename: String): MutableList<String> {
    // Read lines, trim, uppercase and keep only valid 5-letter words
    return try {
        File(filename).readLines()
            .map { it.trim().uppercase() }
            .filter { isValid(it) }
            .toMutableList()
    } catch (e: Exception) {
        // If file doesn't exist or can't be read, return empty list
        mutableListOf()
    }
}


// Pick a random word and return that word 
fun pickRandomWord(words: MutableList<String>): String {
    if (words.isEmpty()) {
        throw NoSuchElementException("Cannot pick a word from an empty list.")
    }
    val rand_word = words.random()
    words.remove(rand_word)
    return rand_word
}


// Count the Number of attempts 
fun obtainGuess(attempt: Int): String{
    while(true){
        println("Attempt $attempt: ")
        val guess = readln().trim().uppercase()

        if (isValid(guess)){
            return guess
        }else{
        println("Invalid Guess. Please enter a 5 letter word")
        }
    }
}



// Compares a Guess with the target word 
fun evaluateGuess(guess: String, target: String): List<Int>{
    
    val result = mutableListOf<Int>()
    
    for (i in 0 until 5){
        if (i < guess.length && i < target.length && guess[i] == target[i]){
            result.add(1)
        }
        else{
            result.add(0)
        }
    }
    return result
}




//Displays the letters 
fun displayGuess(guess: String, matches: List<Int>){
    
    val displayed = StringBuilder()

    
    for (i in 0 until 5) {
        if (i < guess.length && i < matches.size && matches[i] == 1) {
            displayed.append(guess[i])
        } else {
            // show placeholder for non-matching letters
            displayed.append('_')
        }
            }
                println(displayed.toString())
                }