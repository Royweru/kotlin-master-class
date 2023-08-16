fun main(args: Array<String>) {
    val alarm = 6
    when(alarm){
        in 1..5 -> println("This is in the range of 1..5")
        6,7,8,9,10 -> println("your number is in range of 6..10")
        else -> println("Time not in our scope")
    }
}