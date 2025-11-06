// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics
    val data = fetchData()

    // find lowest and highest using built-in helpers (safe for empty lists)
    val lowestRecord = data.minByOrNull { it.second }
    val highestRecord = data.maxByOrNull { it.second }

    // compute average in a single expression
    val avgTemp = data.map { it.second }.average()

    if (data.isEmpty()) {
        println("No data available.")
        return
    }

    println("Number of records: ${data.size}")
    println("Lowest temperature: ${lowestRecord!!.first} -> ${"%.2f".format(lowestRecord.second)}°C")
    println("Highest temperature: ${highestRecord!!.first} -> ${"%.2f".format(highestRecord.second)}°C")
    println("Average temperature: ${"%.2f".format(avgTemp)}°C")
}
