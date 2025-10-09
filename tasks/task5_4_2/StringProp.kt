
val String.tooLong: Boolean 
    get() = this.length >  20 

fun main() {
    println("Enter a string:")
    val input = readln()

    if (input.tooLong()) {
        println("True")  // The string is too long
    } else {
        println("False") // The string is acceptable
    }
}
