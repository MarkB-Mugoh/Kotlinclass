import java.util.*

//functions refer to a block of code that executes a task
//in kotlin we write a function using the fun keyword
//then we define the name of the function
//syntax
//fun main(){}
//we have in kotlin a simple function like shown below
//a simple function is a function with no arguments
fun helloWorld(){
    println("hello world")
}

//we also have functions that take parameters
//for example we are required to print a string with spaces
//e.g k o t l i n
//text: string is our parameter
//what this means is that we have to pass values when calling the function
//this value is what the code execution will work on
fun printWithSpaces(text: String){
    for(char in text){
        print(char  + " ")
    }
    println()
}

//we can also specify the data type an output should give
//as below using the : after the () and specifying the data type
fun currentDate(): Date {
    //date() is a kotlin in built function that allows u to get the current date and time
    return Date()
}

//our final function program example will take in two parameters and return a value
//we want in this program to compare two numbers and find the maximum value
fun maximum(a: Int, b: Int): Int{
    if (a >= b){
        return a
    }else{
        return b
    }
}



//the main function allows us to have outputs in kotlin , it is the entry point to our application
fun main (args: Array<String>){
    helloWorld()
    //calling a function with parameter values
    //kotlin is awesome is binded to the text parameter in the function build up
    printWithSpaces("Kotlin is awesome")
    //calling currentDate
    println(currentDate())
    //calling maximum function
    println(maximum(17,19))
}

