// Task 10.3.2: another example of an explicit null check

fun printreversed(text: String?) {   // allow nullable input

    // perform a null check and handle both cases
    
            val result = text?.reversed()?.uppercase() ?: "result is null"
            println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printreversed(input)
}
