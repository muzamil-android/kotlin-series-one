fun main() {

    /* Null safety is a built-in protection in Kotlin that stops your program from crashing when a variable is empty */

    /* Null safety in Kotlin uses five main tools (?, ?., ?:, !!, and let) to prevent program crash at compile time */


    val name: String? = null /* The ? is a nullable operator which allows one variable to hold null value inside it */


    println("Length of name : ${name?.length}") /* The ?. is safe call that returns null value instead of crashing */


    val finalName = name ?: "Guest" /* The ?: is Elvis operator that gives a default value to variable if is null */

    println(finalName)


    val numOne = "10"

    val numTwo: Int? = numOne.toIntOrNull() /* .toIntOrNull() returns Int? because num One might not be real number */

    val total = numTwo!! + 5 /* The !! is not null assert to force a nullable into a regular non-nullable variable */

    println(total)


    var username: String? = "Muneer"

    username?.let { /* The let is scoped logic that runs code block inside it only when a given data is not null */

        println("Welcome, $username")

    }

}