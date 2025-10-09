
fun main(){
    println("Input Scores ")
    val num1 = readln().toDouble()
    val num2 =readln().toDouble()
    val num3 = readln().toDouble()
    
    val sum = num1 + num2 + num3
    val total = (sum/3 )

    val grade = when(total){
        in 0.0..39.0 -> "Fail"
        in 40.0..69.0 -> "Pass"
        in 70.0..100.0 -> "Distinction"
        else -> "Math Error"
    }
    println("Average: $total")
    println("Grade: $grade")
}