// Task 5.3.2: dice rolling simulation
import kotlin.random.Random


fun rolldie(side : Int, die: Int){
    if (side < 1) {
        println("Error: cannot have a $side-sided die")
        return
    }
    if (die < 1){
        println("Error: No die Identified")
        return
    }
    
    println("Rolling a d$side...")
    val no_die = Random.nextInt(1, die + 1)
    val result = Random.nextInt(1, side + 1)
    println("You have $die after rolling the dice you got $side ")
}