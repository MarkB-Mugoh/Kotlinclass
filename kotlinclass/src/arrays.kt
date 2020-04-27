//to create arrays we use the arrayof function
fun main(args: Array<String>) {
    val county = arrayOf("Kericho", "Mombasa")
    //an array can have a mix of elements
    val mixed = arrayOf("Kotlin",15,3.0)
    //we can specify the type of elements in a array by using the following
    //for integer specific array use the intArray , for double value doublearray
    val numbers = intArrayOf(1,2,3,4)
    val doubleNumbers = doubleArrayOf(3.0,2.0,1.0)
    //we can access elements in array using the [] and index number of the element
    //so to get our 1st element in for example the mixed array
    mixed[0]
    //to print it out
    println(mixed[2])
    //we can also use the [] to reassign values to arrays
    //so to re assign the value of the second element in the array county
    county[1] = "Kisumu"
    //to print it out
    println(county[1])
    //basic string values can be used as arrays
    //for example
    val basicString = "Joseph"
    //so Joseph is an array of characters with J being the 1st character , o being the second .............
    println(basicString[2])
    //we can also concatenate arrays i.e. join two arrays together ,
    //the arrays however have to be of the same type
    //in the following example i want to concatenate the array county with another array governors
    val governors = arrayOf("Mike Sonko","Hassan Joho")
    //to concatenate we use the +
    val governorCounty = county + governors

    //we can count the number of elements in an array by using the .size
    println(governorCounty.size)
    //we use the empty function to know if an array is empty
    //we expect a boolean return from the empty function
    val states: Boolean = county.isEmpty()
    //output
    println(states)
    //to find a certain element in an array we use the contain function
    //for example we want to know if our county array has the county Nairobi
    if (county.contains("Nairobi")){
        println("The array has the county Nairobi")
    }else{
        println("This is not the array you are looking for")
    }

    

}