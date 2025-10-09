// Task 5.4.1: string extension function
fun String.tooLong(): Boolean {
    return this.length > 20
}

fun main(){
    val name = readln()

    if (name.tooLong()) {
        println("True")  // The string is too long
    } else {
        println("False") // The string is acceptable
    }
}