// Task 10.3.2: another example of an explicit null check

fun printeversed(text: String?) {   // allow nullable input

    // perform a null check and handle both cases
    
            val result = text?.reversed()?.uppercase()
            println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printeversed(input)
}
