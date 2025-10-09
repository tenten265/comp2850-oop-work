// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides < 1) {
        println("Error: cannot have a $sides-sided die")
        return
    }
    println("Rolling a d$sides...")
    val result = Random.nextInt(1, sides + 1)
    println("You rolled $result")
}

fun readInt(stan :String): Int{
        println(stan)
        val rent = readln()
        return (rent.toInt())
    }


fun main(){
    val side = readInt("Enter number of sides: ")
    rollDie(side)

    println("\nNow rolling a default d6...")
    rollDie() 
}