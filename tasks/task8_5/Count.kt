fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main() {
    val text = "Hello, World!"
    val vowelsCount = text.howMany { it.lowercaseChar() in "aeiou" }
    println("Number of vowels in '$text': $vowelsCount")
}

