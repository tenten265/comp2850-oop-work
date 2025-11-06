// Task 9.6: functions for dataset variance calculation
import java.io.File
// Add variance() function here
fun variance(data: List<Double>): Double {
    if (data.isEmpty()) return 0.0
    val mean = data.average()
    return data.map { (it - mean) * (it - mean) }.average()
}
// Add readData() function here
fun readData(fileName: String)= buildList<Double> {
    File(fileName).forEachLine { 
        add(it.toDouble())
        }

    }
