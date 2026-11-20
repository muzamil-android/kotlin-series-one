import kotlin.math.abs
import kotlin.math.sqrt

fun main() {

    /* Function is unit to perform tasks and is used to break code into smaller modules to make program more manageable */

    /* Each built function has its own properties like its name, return type, and number of parameters passed inside it */

    usersFunctions()

    libraryFunctions()

    functionArguments()

    recursiveFunctions()

    tailRecursionLogics()

    kotlinInfixFunctions()

    kotlinInlineFunctions()

    kotlinNestedFunctions()

    kotlinScopedFunctions()

    kotlinLambdaExpression()

    kotlinHighOrderFunction()

    kotlinAnonymousFunction()

    kotlinExtensionFunctions()

}


private fun usersFunctions() {

    /* A user-defined function is a block of code that you write and name yourself using fun keyword to perform a task */

    println("Here we show results of user defined functions:")

    student("Ayesha", 'A', 12)

    student("Muneer",'B',30)

    val sumOne = addNumbers(a = 5, b = 10)

    val sumTwo = addNumbers(a = 6, b = 5)

    println("Sum of numbers: $sumOne")

    println("Sum of numbers: $sumTwo")

    greetUser("Josh Inglis")

    greetUser("Alex Carey")

}

private fun student(name: String, grade: Char, rollNo: Int) {

    println("Roll no of student is: $rollNo")

    println("Name of the student is: $name")

    println("Grade of student is: $grade")

}

private fun addNumbers(a: Int, b: Int): Int {

    return a + b

}

private fun greetUser(name: String) {

    println("Hello, $name!")

}


private fun libraryFunctions() {

    /* The built-in Library functions in Kotlin allow you to call them directly in your code without defining yourself */

    println("Here we show results of library functions:")

    println("Max of 10 & 25: ${maxOf(10, 25)}")

    println("Min of 10 & 25: ${minOf(10, 25)}")

    println("Square root of 16: ${sqrt(16.0)}")

    println("Absolute of -50: ${abs(-50)}")


    val word = " This is Kotlin"

    println("Length: ${word.length}")

    println("Lowercase: ${word.lowercase()}")

    println("Uppercase: ${word.uppercase()}")

    println("Replace: ${word.replace("Kot", "Jave")}")


    val numbers = arrayOf(40, 10, 30, 20, 50, 60)

    println("Sorted array: ${numbers.sortedArray().joinToString()}")

    val bigNumbers = numbers.filter { it > 20 }

    println("Filtered (>20): $bigNumbers")

}


private fun functionArguments() {

    /* Default arguments let you assign fallback values to parameters, while named arguments let you specify parameter */

    /* names when calling a function. Together, they make Kotlin functions flexible and easy to read without overloads */


    /* Now we call users logic but with default arguments for a profile */

    println("Here we show results of default arguments:")

    createProfile("Muneer")

    createProfile("Ayesha", "Teacher")

    createProfile("Ali", "Developer", "Islamabad")


    /* Now we call same logic but with named arguments order for user */

    println("Here we show results of named arguments:")

    createProfile(name = "Muneer", city = "Karachi")

    createProfile(city = "Multan", role = "Admin", name = "Sara")

}

fun createProfile(name: String, role: String = "Student", city: String = "Lahore") {

    println("$name | Role: $role | City: $city")

}


private fun recursiveFunctions() {

    /* Recursive function calls itself to solve task by breaking it down into small tasks till it reaches stopping point */

    println("Here we show results of recursive functions:")

    println("Sum of 5 is: " + sumNumbers(5))

    println("Factorial of 5 is: " + numFactorial(5))

    println("Fibonacci of 6 is: " + fibonacci(6))

    println("Power of 2^4 is: " + power(2, 4))

}

private fun numFactorial(num: Int): Long {

    return if (num == 1) num.toLong()

    else num * numFactorial(num - 1)

}

private fun sumNumbers(num: Int): Long {

    return if (num == 1) num.toLong()

    else num + sumNumbers(num - 1)

}

private fun fibonacci(num: Int): Long {

    return if (num <= 1) num.toLong()

    else fibonacci(num - 1) + fibonacci(num - 2)

}

private fun power(base: Int, exp: Int): Long {

    return if (exp == 0) 1L

    else base * power(base, exp - 1)

}

private fun tailRecursionLogics() {

    /* Tail recursion is a special type of recursion where recursive call is absolute last operation performed by some */

    /* function. Here By adding the tailrec modifier in Kotlin, compiler converts recursion into fast and memory safe */

    /* loop behind the scenes, in order to prevent StackOverflowError crashes on large numbers in execution of tasks */

    println("Here we show results of tail recursion:")

    println("Sum of 5 is: " + sumNumber(5))

    println("Fibonacci of 6 is: " + fibonaccis(6))

    println("Factorial of 5 is: " + factorials(5))

    println("Power of 2^4 is: " + powers(2, 4))


}

private tailrec fun fibonaccis(num: Int, a: Long = 0, b: Long = 1): Long {

    return when (num) {

        0 -> a; 1 -> b; else -> fibonaccis(num - 1, b, a + b)

    }

}

private tailrec fun factorials(num: Int, run: Long = 1): Long {

    return if (num == 1) run

    else factorials(num - 1, run * num)

}

private tailrec fun sumNumber(num: Int, run: Long = 0): Long {

    return if (num == 0) run

    else sumNumber(num - 1, run + num)

}

private tailrec fun powers(base: Int, exp: Int, run: Long = 1): Long {

    return if (exp == 0) run

    else powers(base, exp - 1, run * base)

}

private fun kotlinLambdaExpression() {

    /* A lambda expression is a short, concise block of code wrapped in curly braces { } that acts like a mini-function */

    /* This is widely used in Kotlin for passing logic into other functions like .filter or .forEach for solving tasks */

    /* The syntax of a lambda expression is val variableName: (ParameterTypes) -> ReturnType = { parameters -> body } */

    println("Here we show results of lambda expression:")

    /* Lambda with two parameters but no inference for Kotlin */

    val add: (Int, Int) -> Int = { a, b -> a + b }

    println("Sum for two numbers: " + add(5, 3))


    /* Lambda with two parameters with inferences for Kotlin */

    val multiply = { x: Int, y: Int -> x * y }

    println("Product is: " + multiply(4, 5))


    /* When only 1 parameter, then skip naming and use 'it' */

    val square: (Int) -> Int = { it * it }

    println("Square is: " + square(6))

}


private fun kotlinAnonymousFunction() {

    /* An anonymous function looks just like a regular fun declaration, except its name is omitted, and is useful when */

    /* you need to explicitly specify the return type or use multiple return statements inside the same function body */

    /* The syntax for anonymous function is val variableName = fun(parameters): ReturnType { // body  return value } */

    println("Here we show results of one anonymous function:")

    val subtract = fun(a: Int, b: Int): Int { return a - b }

    println("Difference of number is: " + subtract(10, 4))


    val divide = fun(a: Int, b: Int): Int = a / b

    println("Division is: " + divide(20, 4))

}


private fun kotlinExtensionFunctions() {

    /* An extension function in Kotlin lets you add new functions to one existing class without inheriting from it or */

    /* modifying its original source code. Once defined you can call it using dot notation (.) like built-in methods */

    /* The syntax of extension function in Kotlin language : fun ReceiverType.function(parameters): ReturnType {  } */

    println("Here we show results of extension function:")

    val name = "Muneer"

    println(name.greet())

    println(name.surroundWith("***"))


    val num = 10

    println("Is 10 even? " + num.isEven())


}

private fun String.greet(): String {

    return "Hello, $this!"

}

fun Int.isEven(): Boolean {

    return this % 2 == 0

}

fun String.surroundWith(symbol: String): String {

    return "$symbol$this$symbol"

}


private fun kotlinInfixFunctions() {

    /* In Kotlin, the infix function is a special function marked with infix keyword which can be called without using */

    /* a dot or parentheses. This makes your code read much closer to natural English, it must be any member function */

    /* in a class or an extension function, and it must accept exactly one parameter which cannot have default value */

    println("Here we show results of infix function:")

    val result = 3 times "Hello "

    println(result)

    val alice = Person("Alice")

    alice likes "Biryani"

}

private infix fun Int.times(str: String): String {

    return str.repeat(this)

}

private class Person(val name: String) {

    infix fun likes(food: String) {

        println("$name likes $food")

    }

}


private fun kotlinInlineFunctions() {

    /* In Kotlin, an inline function is a function that is marked with the inline keyword that instructs a compiler to */

    /* copy the bytecode of a function directly into the call site rather than generating some standard function call */

    println("Here we show result of inline function:")

    val myList = measureTime {

        List(1000) { it * 2 }

    }

    println(myList)


}

private inline fun measureTime(block: () -> Unit) {

    val result = block()

    val end = System.nanoTime()

    val start = System.nanoTime()

    println("Elapsed time: ${(end - start) / 1_000_000} ms")

    return result

}


private fun kotlinHighOrderFunction() {

    /* Higher order function is a logic that takes another function as a parameter, returns a function, or does both */

    println("Here we show result of higher order function:")

    val sum = calculate(10, 5) { x, y -> x + y }

    val product = calculate(5, 10) { x, y -> x * y }

    val difference = calculate(10, 5, ::subtract)

    println("Sum : $sum, Product : $product, Difference : $difference")

    val doubleIt = createMultiplier(2)

    val tripleIt = createMultiplier(3)

    println(doubleIt(5)); println(tripleIt(5))

}

private fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {

    return operation(a, b)

} private fun subtract(x: Int, y: Int): Int = x - y

fun createMultiplier(factor: Int): (Int) -> Int {

    return { number -> number * factor }

}


private fun kotlinScopedFunctions() {

    /* The scoped functions execute code within the context of an object by making null checks and chaining cleaner */

    println("Here we show result of scoped function:")

    val text = "kotlin"

    var upper: String? = text.uppercase()

    upper?.let { println("Welcome, $upper") }

    val wordsLength = text.run { length + 10 }

    val firstLetter = with(text) { first() }

    val sameText = text.also { println("Word is: $it") }

    val greeting = StringBuilder("Hi ").apply { append("Ali!") }

    println("$upper | $sameText | $wordsLength | $firstLetter | $greeting")

}


private fun kotlinNestedFunctions() {

    /* The nested function in Kotlin is declared inside another function such as it keeps helper logic private to that */

    /* specific function and can directly access outer parameters of function and variables to process values easily. */

    processOrder("Laptop Stand", 2, 2500.0)

    processOrder("Laptop Driver", 3, 500.0)

}

private fun processOrder(item: String, quantity: Int, pricePerItem: Double) {

    fun calculateFinalPrice(): Double { val taxRate = 0.16

        val subtotal = quantity * pricePerItem

        return subtotal + (subtotal * taxRate)

    }

    if (quantity <= 0) {

        println("Invalid quantity for $item")

    }

    val total = calculateFinalPrice()

    println("Order: $quantity x $item | Total with tax: Rs. $total")

}