//this is how we write switch statements
//keyword when is used
//predetermined you mean that its form or nature was decided by various events or chances

//this program will take my number and output a pre determined out

//function goes
fun guessNumber(num: Int){
    when(num){
        0-> println("you win a ksh.10,000 voucher")
        1-> println("you win a ksh.50,000 voucher")
        10-> println("Congratulations, you are the tenth customer")
        else -> {
            println("Sorry that is not a voucher number, try again")
        }
        }
    }

    fun main(args:Array<String>){
        var a= 1
        guessNumber(a)
    }

