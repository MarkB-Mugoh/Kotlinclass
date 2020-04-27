//now we want to practice more on loops
//we are creating a program that reverses a list

fun main(args: Array<String>) {
    //so we have our numbers list
    val numbers  = listOf(1,2,3,4,5)
    println(reverse(numbers))
    println(reverse2(numbers))

}
//function to reverse the list
fun reverse(list: List<Int>): List<Int> {
    //anytime this <> appears along a function note that the data type is being specified
    val result = arrayListOf<Int>()
    for (i in 0..list.size-1){
        result.add(list.get(list.size-1-i))
    }
    return result
}

//we can achieve the same reverse by doing this
fun reverse2(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0){
        result.add(list.get(i))
    }
    return result
}