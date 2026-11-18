fun main() {

    /* The variable is a named storage container in memory that holds a value, and can be accessed and modified while the program runs. */

    /* In order to declare variables we have multiple ways as Basic : val/var varName: dataType = value, e.g. val name: String = "Ali" */

    /* the other ways are Type Inference : val/var varName = value, e.g. val name = "Ali" or var age = 5 to auto obtain one data type */

    /* Explicit Type : val/var varName: dataType = value or val/var varName: dataType then later gives value as varName = value, and */

    /* Nullable Var : val/var varName: dataType? = null, it is used on var but in some cases it is used on val in conditional check */


    /* The immutable variable is declared by val keyword, it allows only read tasks and its value can not be changed once assigned */

    val studentName = "Mohamed Muzamil"

    println("My name is : $studentName")

    val newStudent: String = studentName

    println("New student is : $newStudent")


    /* The mutable variable is declared by var keyword, it allows us read-write tasks and its value can be changed multiple times */

    var className = "BS Information"

    className = "BS computer science"

    println("My age is : $className")

    var cityName: String? = null

    cityName = "Hallway Capital"

    println("My city is : $cityName")

}

