
fun main(){

    val word_file = "data/words.txt"
    val max_attempt = 10

    val word = readWordList(word_file)

    if (word.isEmpty()){
        println("Error: The list is empty ")
        return
    }

    val target = pickRandomWord(word)

    println("Welcome to Teni's SImplified Worlde Project")
    println("Your ain objective is to Guess'$target' in $max_attempt attempts. Goodluck")

    var att = 1
    var win = false
    var currentAtt: String? = null

    while (att <= max_attempt){
        currentAtt = obtainGuess(att)

        val mat =  evaluateGuess(currentAtt, target)
        
        displayGuess(currentAtt, mat)

        var tot_mat = true
        for(mats in mat){
            if (mats != 1){
                tot_mat = false
                break
            }
        }
        if (tot_mat){
            win = true
            break
        }
        att++
    }
    if (win){
        println("CONGRATULATIONS ON UR VICTORY.")
    }else{
        println("Boo! TRY AGAIN ")
    }

}