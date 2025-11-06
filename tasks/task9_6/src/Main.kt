// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // expect a filename as the first command-line argument
    if (args.isEmpty()) {
        System.err.println("Usage: <program> <data-file>")
        System.err.println("Please provide the data file name as a command-line argument.")
        exitProcess(1)
    }

    val fileName = args[0]

    // attempt to read the data and compute variance; any exception is caught
    val result = kotlin.runCatching { readData(fileName) }

    val data = result.getOrElse { ex ->
        System.err.println("Error reading data from '$fileName': ${ex::class.simpleName}: ${ex.message}")
        // optionally print a short cause or hint
        if (ex is java.io.FileNotFoundException) {
            System.err.println("File not found: $fileName")
        }
        exitProcess(1)
    }

    // print the dataset size and variance (variance formatted to five decimal places)
    val varValue = kotlin.runCatching { variance(data) }
        .getOrElse { ex ->
            System.err.println("Error computing variance: ${ex::class.simpleName}: ${ex.message}")
            exitProcess(1)
        }

    println("Dataset size: ${data.size}")
    println("Variance: ${"%.5f".format(varValue)}")
}
