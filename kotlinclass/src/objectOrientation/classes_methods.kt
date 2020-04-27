//today we are going to cover object oriented programming in kotlin
//classes
//we can create classes in kotlin using the class keyword followed by the name of the class
//classes generally house properties and methods, which define an object
//the class name should always start with an uppercase letter
//the syntax therefore is class NameofClass{}
//creating a class person
class Person{
    //the first thing we can do is define properties for our class
    //properties are basically variables we define within a class
    //so to intialize say a name and age property for our class person
    var name: String = "Joseph"
    var age: Int = 24
    //we use methods to assign functionalities to our classes
    //methods are basically functions within a class
    //with a basic function
    fun speak(){
        println("hello world")
    }
    //with a function that takes parameters
    //say we have a function that greets another user
    fun greet(name: String, age: Int, hobby: String){
        println("hello $name your age is $age and your hobby is $hobby ")
    }
    //we can add more parameters to the function above by separating the elements using a ,
    //i.e fun greet(name: String, age: Int)

    //we can also write return statements within methods
    //say we want to return the year of birth of our person object with a specific data type
    fun getYearOfBirth() = 2020 - age
    //with return statement
    fun yearOfBirth(): Int{
        return 2020 - age
    }
}


fun main(args: Array<String>){
    //calls out the properties for the class person
    val person = Person()
    //to print out the values in our class object
    println(person.name)
    println(person.age)
    //we can also reassign the values of a property
    person.name = "Abel"

    //to output my methods
    //basic function
    person.speak()

    //function with a parameter
    person.greet("peter",24,"Soccer")
    //to get year of birth
    println(person.getYearOfBirth())

}
