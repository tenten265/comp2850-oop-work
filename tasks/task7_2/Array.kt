fun main() {
    val numbers = intArrayOf(4, 5, 7, 0 , 8 , 6)

    val cls = numbers.javaClass

    println(cls.qualifiedName)
    println(cls.java)
}