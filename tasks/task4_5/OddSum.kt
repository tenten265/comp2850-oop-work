// Task 4.5: summing odd integers with a for loop
fun main(){
    println("Input range:")

    val user = readln().toInt()
    var total = 0

    for (n in 1..user){
        if (n % 2 != 0) { 
           total += n
        }
    }
    println("Sum of Odd integers $total")
}