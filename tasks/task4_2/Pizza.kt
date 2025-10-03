fun main() {
    println("Pizza Menu")
    println(" (a) Magarita ")
    println(" (b) Peperoni ")
    println(" (c) Seafood ")
    println(" (d) Hawiian ")
    println(" Choose a Pizza choice. ")

    val choice = readln().lowercase()

    if (choice == "a") {
        println("Magarita Pizza confirmed ")
        println("Thank You for patronage")
    }else if (choice ==  "b"){
        println("Peperoni Pizza confirmed ")
        println("Thank You for patronage")
    }else if (choice == "c"){
        println("Seafood Pizza confirmed ")
        println("Thank You for patronage")
    }else if(choice == "d"){
        println(" Hawiian Pizza confirmed ")
        println("Thank You for patronage")
    }else{
        println("Option not in the menu")
    }
}