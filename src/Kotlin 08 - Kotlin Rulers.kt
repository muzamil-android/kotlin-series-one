fun main() {

    /* The statement is a single, complete instruction in a program that tells the computer to perform a specific action */

    /* such as storing a value, printing text, or control program flow, and in Kotlin we have three kinds of statements */

    whenStatement()

    breakStatement()

    continueStatement()

}

private fun whenStatement() {

    /* A when expression in Kotlin is a concise, multi-branch conditional structure that matches a value or rule against */

    /* possible branches and executes first matching block in acting as a more powerful replacement of switch statement */

    print("Enter the name of heavenly body: ")

    val name= readln().ifBlank { "unknown name" }

    when(name) {

        "Sun" -> print("The Sun is a Star")

        "Earth" -> print("Earth is a planet")

        "Moon" -> print("Moon is a Satellite")

        else -> print("Enter Sun, Earth, or Moon")

    }

}

private fun breakStatement() {

    /* Break statement immediately kills its enclosing loop and transfer program control to one line of code after loop */

    for (i in 1..10) {

        if (i == 5) {

            println("Stopping the loop at $i")

            break /* Exits the loop completely when indexer reaches 5 */
        }

        println("Number: $i")

    }

    println("Loop finished.")

}

private fun continueStatement() {

    /* Continue statement skips remaining code in loop iteration and jumps directly to next iteration of enclosing loop */

    for (i in 1..6) {

        if (i == 3) {

            println("Skipping number $i")

            continue /* Skips printing "Number: 3" and jumps to i = 4 */

        }

        println("Number: $i")

    }

    println("Loop finished.")

}