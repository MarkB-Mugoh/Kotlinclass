package objectOrientation
//constructors are used when we want to pass information to function parameters using classes and methods
//they make classes more dynamic to work with
//constructors are created by first passing the parameters to the class object
class Book(name:String, pages:Int){
    //do code execution here
    //the first thing we do is intialize our storage units i.e. variables
    val name: String
    var pages: Int
    //next we create an init block that will allow us to access the class parameters and use them in functions
    init{
        this.name = name
        this.pages = pages
    }

}

//to output
fun main(args: Array<String>){
    //this passes the values in the parentheses to the parameters in our book object
    //creating a new variable to pass values to print out
    val book = Book("The alchemist",900)
    //to print this out
    println(book.name)
    println(book.pages)

}