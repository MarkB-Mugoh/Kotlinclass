//loops are a useful part of programming as they allow us to write code once and repeat
//a particular task with it
//the first type is the for loop
//for loops allow you to repeat a certain piece of code a number of times
//i.e u know in advanced how many times u want to loop
//say we want to print the number one to ten without using the statement println() for
//each number, we can use a for loop for this task.

fun main(args: Array<String>) {
   //to know sum of numbers between 1 -10
    var sum = 0

    //first we call the range
    //the i represent a variable storage unit for the elements to be looped over
    for(i in 1..10){
        //the above line call a range of numbers
        //the intialization counter for the for loop starts at one
        //that is i = 1 , then in the second loop i will be two and so forth
        //the output now is
        println(i)
        //so if i want to do something 10 times i.e print my name 10 times
        println("Joseph")
        //say we want to know the sum of the numbers between 1-10
        sum = sum + i
    }
//    to print out the sum
    println(sum)
    // the for loop is very useful when iterating or using elements within an array or list
    val list = listOf("chelsea","liverpool","city")
    //if i want to print all of them
    //element represents a variable storage unit for the elements within the array or list
    for (element in list){
        println(element)
    }
    //say we wanted to store two values in our loop
    //for example print out the elements in the array plus their index number
    for ((index,value) in list.withIndex()){
        //now we store the index value in the index tag and the value itself in the value tag
        //to output
        println("element in $index is $value")
    }
}