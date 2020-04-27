//we use list when we want to add and delete values to an array
fun main(args: Array<String>) {
    //we create lists using the array list of function
    val arrayList = arrayListOf("Patrick","Carol","Stephen")
    println(arrayList)
    //to output a specific element access it using the index number
    println(arrayList[2]) //should print stephen
    //we can also concatenate lists using the + sign
    val interest = arrayListOf("Soccer","Singing","Dancing")
    //to concatenate
    val personalInterest = arrayList + interest
    //the size now is : using the size function
    println(personalInterest.size)
    //we can also use the empty function to check if a list is empty
    println(arrayList.isEmpty())
    //we can also use the contain function to check if a list contains a specific element
    println(arrayList.contains("Carol"))
    //unlike arrays we can add elements to lists using the .add function
    //adding element to arrayList function
    arrayList.add("Joseph")
    println(arrayList)
    //joseph is added as the fourth element to our list
    //to add an element to a specific position, specify the index position 1st
    arrayList.add(0, "Mary")
    println(arrayList)
    //we can also delete elements from a list unlike an array
    //we use the .remove function to remove elements
    arrayList.remove("Stephen")
    println(arrayList)
    //when we add and remove elements from an array ,we can track the activities using boolean responses
    // for example if i wanted to remove an element from the arrayList that did not exist the response
    //should be failed as follows and vice versa when u add.
    val removed = arrayList.remove("Eve")
    println(removed)
    //the final function is the function sublist
    //this allows u to pick elements using their index position in a list
    //we use the .sublist function to achieve the same
    val inter = interest.subList(0,2)
    println(inter)

}

