// Task 8.3: functions for temperature analysis

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> {
  // Create and return a simulated dataset here
  // Use the listOf() and to() functions to create the dataset
  return listOf(
    "2023-01-01" to 5.0,
    "2023-01-02" to 6.5,
    "2023-01-03" to 4.0,
    "2023-01-04" to 7.2,
    "2023-01-05" to 3.8
  )
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
