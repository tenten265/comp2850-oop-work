import kotlin.random.Random
import kotlin.io.readLine

//Check if the word value == 5
fun isValid(word: String):  Boolean{
    if(word.length == 5){
        return true
    }
    else{
        return false 
    }
}


// Read word from the word.txt file 
fun readWordList(filename: String): MutableList<String>{
    return File(filename).readLines().toMutableList() 
}


// Pick a random word and return that word 
fun pickRandomWord(words: MutableList<String>): String{
    val rand_word = words.random()
    words.remove(rand_word)
    return rand_word
}


// Count the Number of attempts 
fun obtainGuess(attempt: Int): String{
    val attempts = 1

    while(true){
        val guess = readln().trim()

        if (guess == attempt){
            return guess
            break
        }
    }else{
        print("Try again")#
        attempts++ 
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

    
    for (i in 0 until 5){
        if (i < guess.length && i < matches.length && guess[i] == matches[i]){
            displayed.append(guess[i])
        }
        else{
            displayed.append("?")
        }
    }
    println(displayed.toString)
}