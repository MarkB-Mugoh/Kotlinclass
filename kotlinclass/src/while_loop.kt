//we use while loops when we do not know the number of iteration we want to do
//for example looping over a text file that u do not know when it ends
fun main(args: Array<String>) {
    var x = 9
    //say we want to print the numbers from x down to 0
    while (x >= 0){
       println(x)
        //to print out in decreasing format
        x--
    }
    //to increase
    var i = 1
    while (i <= 10){
        println(i)
        i++
    }

    //we can add arbirtiary conditions in while loops
    //statement conditions
    //say we have a program that prints out hello world only when user is online
    //we can perform the task in a while loop as such
//    while (user.isOnline){
//
//    }

}