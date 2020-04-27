//we use control flows to write out logical statements
//control flows includes: if amd else statements together with switch cases
//if and else statements
//example: A program that checks on various conditions

fun max(a:Int, b:Int): Int {
    var answer:Nothing=
        if (a>b){
            return a
        } else if (a==b){
            return a
        } else {
            return b
        }
}
//function to print out my value
fun main(args:Array<String>){
    var a: Int =6
    var b: Int=10
    //calling my function
    var max: Int=max(a,b)
//printing output
    println(max)
}
