fun main() {

    /* Kotlin standard input is basic operation performed to flow byte streams from an input device to main memory. */

    /* You can take a user input with readln() method which reads line and crashes when nothing is left to read or */

    /* You can take user input with readlnOrNull method that reads line and return null when nothing left to read */

    println("Enter your full name")

    val name = readln().ifBlank { "unknown name" }

    println("Your name is: $name"); print("Enter your class name")

    val degree = readlnOrNull()?.ifBlank { "not specified" }

    println("Your class is: $degree"); println("Enter your semester")

    val semester: Int = readln().toIntOrNull() ?: 0

    println("Your semester is: $semester")

}