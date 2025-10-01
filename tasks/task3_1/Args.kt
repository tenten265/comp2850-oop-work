// Task 3.1: command line arguments

fun main(args: Array<String>) {
    if (args.size <= 1){
        println("Not enough arguments")
    }
    else{
        println("$args")
    }
}
