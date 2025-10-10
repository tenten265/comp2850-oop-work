

import kotlin.io.readLine
fun isValid(word: String):  Boolean{
    if(word.length < 6){
        return true
    }
    else{
        return false 
    }
}

fun readWordList(filename: String): MutableList<String>{
    return File(filename).readLines().toMutableList() 
}

fun pickRandomWord(words: MutableList<String>): String{

}

fun obtainGuess(attempt: Int): String{}

fun evaluateGuess(guess: String, target: String): List<Int>{

}

fun displayGuess(guess: String, matches: List<Int>){

}