fun main() {

    /* Arrays are used to organize data in programming so that related set of all values can be sorted or searched easily */

    /* They are stored in contiguous memory locations, can be accessed through their index keys, and fixed in their size */

    createArrays()

    accessArrays()

}


private fun createArrays() {

    /* In Kotlin, arrays are not native data type but mutable collection of similar items that are shown by Array class */

    /* So we can use library function arrayOf() in order to create one array by passing values of elements to function */

    val arrayOne = arrayOf(1, 2, 3, 4, 5)

    println("Showing number list without index:")

    for (element in arrayOne) {

        println("$element")

    }


    val arrayTwo = arrayOf(1, 2, 3, 4, 5)

    println("Showing number list with index:")

    for ((index, element) in arrayTwo.withIndex()) {

        println("Index $index holds $element")

    }


    val arrayThree = arrayOf(1, 2, 3, 4)

    println("Showing number list via index:")

    arrayThree.forEach {

        index -> println(index)

    }


    val arrayFour = arrayOf(1, 2, 3, 4, 5)

    println("Showing number list via index:")

    for (i in arrayFour.lastIndex downTo 0) {

        println("${arrayFour[i]}")

    }


    val arrayFive = arrayOf(1, 2, 3, 4, 5)

    println("Showing sum of an array list:")

    var sum = 0

    for (element in arrayFive) {

        sum += element

    }

    println("Total sum: $sum")

}


private fun accessArrays() {

    /* The array in Kotlin is a class hence we can access data of class object via its member functions get() and set() */

    /* The get() method takes an index of element and returns a value of item at that index such as val x = num.get(0) */

    /* The set() method takes an index of element and a value that is to be added at this index such as num.set(1, 3) */

    val arrayOne = arrayOf(1, 2, 3, 4, 5)

    val firstItem = arrayOne.get(index = 0)

    println("First item of array: $firstItem")

    arrayOne.set(index = 0, value = 99)

    arrayOne.set(index = 4, value = 50)

    println("Updated array: ${arrayOne.contentToString()}")


    /* While get() and set() work are good Kotlin advices square brackets [] because it is cleaner and easier to read */

    println("First item: $firstItem")

    println("Showing array access with square brackets:")

    arrayOne[0] = 99 /* Works same as arrayOne.set(0, 99) */

    arrayOne[4] = 50 /* Works same as arrayOne.set(4, 50) */

    println("Updated array: ${arrayOne.contentToString()}")


    /* If you try to get() or set() on indexes that does not exist like index 10 on 5 item array then program crashes */

    /* with ArrayIndexOutOfBoundsException so you can use getOrNull() or getOrElse() method to access elements safely */

    println("Getting array values with safety measures:")

    /* For this line our output will be null and no crash */
    println(arrayOne.getOrNull(10))

    /* For this line our output will be -1 and no crashes */
    println(arrayOne.getOrElse(10) { -1 })


    /* Kotlin does not have setOrNull() method for arrays, so check array.indices first to safely update some element */

    println("Setting array values with square brackets:")

    if (0 in arrayOne.indices) arrayOne[0] = 99

    if (4 in arrayOne.indices) arrayOne[4] = 50

    /* For this line code is safely skipped and no crash */
    if (10 in arrayOne.indices) arrayOne[10] = 100 //

    println("Updated array: ${arrayOne.contentToString()}")

}