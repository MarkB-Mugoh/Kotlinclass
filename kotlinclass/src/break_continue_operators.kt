//the break operator is used together with loops
//the break operator allows us to jump to the end of a loop
//the continue operator allows us to go to the next iteration of a loop sequence

fun main(args: Array<String>) {
    //the break operator
  //say we want to loop over each character in a string
//    and the loop should stop when a certain letter is reached
    for (c in "python"){
        if (c == 'o'){
            break
        }
        print(c)
    }
    //the break operator is useful when we are only intrested in the occurance of something

    //the continue will skip only one iteration and moves on to the next
    //say u have a list of users and you want to work with only active users
    //so u create a function that checks if a user is active if not moves to the next user

    val list = listOf("book","tool","till","seal")
    //in the above array i only want to work with items that have the letter o
    for (str in list){
        //checking if string does not contain the letter o
        if (!str.contains('o')){
            continue
        }
        print(str)
    }
}