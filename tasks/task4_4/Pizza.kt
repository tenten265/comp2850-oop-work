fun main() {
    println("Pizza Menu")
    println(" (a) Magarita ")
    println(" (b) Peperoni ")
    println(" (c) Seafood ")
    println(" (d) Hawiian ")
    println(" Choose a Pizza choice. ")
    
    while(true){
        println("Choose a pizza from a/b/c/d")
        val choice = readln().lowercase()

        if (choice == "a") {
            println("Magarita Pizza confirmed ")
            break
        }else if (choice ==  "b"){
            println("Peperoni Pizza confirmed ")
            break
        }else if (choice == "c"){
            println("Seafood Pizza confirmed ")
            break
        }else if(choice == "d"){
            println(" Hawiian Pizza confirmed ")
            break
        }
        else{
            println("Option not in the menu")
        }   
    }
    println("THANK YOU FOR YOUR PATRONAGE")   
}      