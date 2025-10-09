// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circlePeri(radius: Double) = 2 * PI * radius 

fun readDouble(prompt: String):Double{
    println(prompt)
    val input = readln()
    return input.toDouble()
}

fun main(){
    val radius = readDouble("Enter a Radius: ")

    val area = circleArea(radius)
    val Peri= circlePeri(radius)

    println("For the radius $radius the Area and Peri are $area and $Peri")
}