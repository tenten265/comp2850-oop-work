// Task 5.1.1: anagram checking using a function
infix fun String.isAnagramOf(other: String): Boolean {
    if (this.length != other.length) return false

    val firstChars = this.lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main(){
    println("enter two variables: ")
    val fir = readln()
    val sec = readln()
    

    if (fir isAnagramOf sec){
        println(" $fir and $sec are Anagrams ")
    }
    else{
        println(" $fir and $sec are not Anagrams")
    }
}