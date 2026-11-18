fun main() {

    /* Kotlin controls flow of program based on rules and if rule is true then control enters in block and runs logic */

    /* An if statement is used to specify whether a given code block will be executed or not when given rule is true */

    println("Enter your full name")

    val name = readln()

    if (name.isBlank()) {

        println("Kindly enter your name")

    }


    /* An if else statement contains two blocks of rules, here if rule is used to execute block of code when a given */

    /* condition becomes true, and else statement is used to execute another block of code when condition is false. */

    println("Enter your current weight")

    val weight = readln().toIntOrNull() ?: 0

    if (weight < 0) {

        println("Kindly enter valid weight")

    } else {

        println("Your weight is: $weight")

    }


    /* An if-else ladder checks many rules from top to bottom, executing block for first true rule and skipping rest */

    /* However when none of listed rules are true then logic in a final else block runs by default to return result */

    println("Enter your age to check your category:")

    val userAge = readln().toIntOrNull() ?: 0

    if (userAge <= 0) {

        println("Kindly enter a valid age")

    } else if (userAge < 13) {

        println("You are a Child")

    } else if (userAge < 20) {

        println("You are a Teenager")

    } else if (userAge < 60) {

        println("You are an Adult")

    } else {

        println("You are a Senior Citizen")

    }

}