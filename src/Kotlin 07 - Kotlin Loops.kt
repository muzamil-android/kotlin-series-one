fun main() {

    /* The loop is used to execute given block over and over until rule is met e.g. when you have to print the counting for */

    /* 1 to 100 then you will write print 100 times but with loop you can save time, and need to write only two code lines */

    forLoopLogic()

    whileLoopLogic()

    doWhileLoopLogic()

}


private fun forLoopLogic(){

    /* The Kotlin for loop repeats block of code for each item in a given range, collection, or array to safe execute it */

    println("Counting 1 to 5:") /* 01 - Here we are counting up in inclusive manner with no kill to print 1, 2, 3, 4, 5 */

    for (i in 1..5) {

        println(i)

    }


    println("Counting until 5:") /* 02 - Now we are counting up by killing our final or last number to print 1, 2, 3, 4 */

    for (i in 1..<5) {

        println(i)

    }

    println("Countdown by 2:") /* 03 - Now we are counting down with a step size approach to print data 10, 8, 6, 4, 2 */

    for (i in 10 downTo 1 step 2) {

        println(i)

    }

    val subjects = listOf("Kotlin", "Android", "Data Mining")

    println("Your subjects: ")  /* 04 - Now we are looping through a list of items to display names for academic books */

    for (subject in subjects) {

        println("- $subject")

    }

}


private fun whileLoopLogic(){

    /* A while loop executes a block of code as long as given rule is true by checking that rule before each iteration */

    var count = 1

    println("Counting with while loop:")

    while (count <= 5) { /* 01 - First we will learn simplest to print counting in range of 1 to 5 by using while loop */

        println("$count")

        count++

    }


    var name = "" /* First we keep no value into name */

    while (name.isBlank()) { /* 02 - Here we implement logic to keep asking until some user enters valid name as input */

        println("Enter your name (cannot be empty):")

        name = readln() /* keeps reading input line */

    }

    println("Welcome, $name!") /* lastly show name */


    println("The name of students in class:")

    val names = arrayOf("Noman","Shafiq","Hashim","Farhan","Hashim","Faiz")

    var index = 0 /* At first, we will keep index for array at value zero */

    while(index < names.size) { /* 03 - Now we are adding logic to show names of student from an array with while loop */

        println(names[index]) /* Then we will print names from an array */

        index++

    }

}


private fun doWhileLoopLogic(){

    /* The do-while loop runs its block once first, then it checks a given condition and repeats while it remains true */

    var age: Int

    do { /* 01 - Here we implement logic to ask user to submit a valid age at least once until user gives correct age */

        println("Enter a valid age (greater than 0):")

        age = readln().toIntOrNull() ?: 0

    } while (age <= 0)

    println("Your valid age is: $age")



    var number = 6

    var factorial = 1

    do { /* 02 - Now we implement logic to find factorial of number 6 with do while loop and then show it as an output */

        factorial *= number

        number--

    } while(number > 0)

    println("Factorial of 6 is $factorial")

}