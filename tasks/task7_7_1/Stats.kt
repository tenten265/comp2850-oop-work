// Task 7.7.1: stats for a numeric dataset

fun readData() = buildList { 
    println("Enter a user Prompt: ")

    while (true){
        val prompt = readln()

        if (prompt.lowercase() == "done") break

        val number = prompt.toDoubleOrNull()

        if(number != null){
            add(number)
        }
        else{
            println("INVALID INPUT.")
        }
    }
 }

fun median(mid: Double){
    
}
