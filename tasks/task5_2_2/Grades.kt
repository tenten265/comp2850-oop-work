// Task 5.2.2: conversion of marks into grades, using a function


fun grade(mark: Double): String {
    return when (mark) {
        in 0.0..39.0   -> return "Fail"
        in 40.0..69.0  -> return "Pass"
        in 70.0..100.0 -> return "Distinction"
        else       -> return "?"
    }
}

fun main(args: Array<String>) {

    if (args.size < 2) {
    println("Please provide at least two arguments.")
    return
    }
    
    for(arg in args){
        val mark = arg.toIntOrNull()
        if (mark != null){
            println("Exam score: $mark ")
            break
        }
        else{
            println("Input score: ")
        }
    }
}