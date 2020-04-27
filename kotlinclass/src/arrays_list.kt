//we use arrays and lists when we want a variable to hold a
//collection of things e.g a list of countries

//there is a diff. btw arrays and lists

//we use arrays when we know the number of elements in a record
//and that number of elements is constant
//arrays are very useful when interacting with loops
//we use lists when we want to add and delete elements in a record
fun main(args: Array<String>) {
//for example we want to store all the counties in Kenya
//so to create an array using the arrayof function we store it in an imutable variable array
    val array = arrayOf("Baringo","Nairobi","Mombasa")
//for example a list of food that u like , u may try sth new and want to add it to your list
//or u decide u don't like an item and want to remove it
//so u can create an imutable list using the imutable listof function or the mutable arraylist function
    //list of function
    //you cannot add any element using the add function to a listof array
    val list = listOf("Beef","mutton")
    //array list of function
    //i can add elements to my arraylistof function using the add function
    val arrayList = arrayListOf("orange" , "banana")
    //to add
    arrayList.add("apple")
}

