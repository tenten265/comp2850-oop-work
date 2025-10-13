// Task 7.3.1: list element access
fun main(){
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))
    println(numbers[10])

    numbers.add(7)
    numbers.removeAt(3)
}