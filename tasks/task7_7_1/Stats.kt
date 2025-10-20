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

fun median(mid: List<Double>): Double {
    val sortedList = mid.sorted()
    val size = sortedList.size

    return if (size % 2 == 1) {
        sortedList[size / 2]
    } else {
        val middle1 = sortedList[size / 2 - 1]
        val middle2 = sortedList[size / 2]
        (middle1 + middle2) / 2
    }
}

fun mean(mean: List<Double>): Double {
    return mean.sum() / mean.size
}

fun main() {
    val data = readData()

    if (data.isEmpty()) {
        println("No data entered.")
        return
    }

    val calculatedMean = mean(data)
    val calculatedMedian = median(data)

    println("Mean: $calculatedMean")
    println("Median: $calculatedMedian")
}