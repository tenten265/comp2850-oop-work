// Task 7.7.2: contact database, using a map
fun contactsDatabase(): MutableMap<String, String> {
    val contacts = mutableMapOf<String, String>()
    println("Enter contact name and phone number (or type 'done' to finish):")

    while (true) {
        val input = readlnOrNull() ?: break

        if (input.lowercase() == "done") break

        val parts = input.split(Regex("\\s+"))

        if (parts.size >= 2) {
            val name = parts[0]
            val phoneNumber = parts.subList(1, parts.size).joinToString(" ")
            contacts[name] = phoneNumber
        } else {
            println("INVALID INPUT.")
        }
    }
    return contacts
}

fun main() {
    val contacts = contactsDatabase()

    if (contacts.isEmpty()) {
        println("No contacts entered.")
        return
    }

    println("Contacts List:")
    for ((name, phoneNumber) in contacts) {
        println("$name: $phoneNumber")
    }
}