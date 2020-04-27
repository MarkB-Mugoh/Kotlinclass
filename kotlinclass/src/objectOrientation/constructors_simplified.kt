package objectOrientation
//in the previous class constructors.kt
//what is shown is the basic methodology of creating constructors
//we can achieve the same in kotlin using simplified code block
//this avoids boilerplate code
//this is done by defining the variables within the parameters parentheses
class Country(val name: String, var population: Int){
    //u can have multiple methods here
}

fun main (args: Array<String>){
    val country = Country("Kenya" , 40000000)
    println(country.name)
    println(country.population)
}