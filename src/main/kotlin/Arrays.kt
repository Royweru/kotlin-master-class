fun main(args: Array<String>) {
    val names  = arrayOf("John","Stevo","peter")
    val numbers = arrayOf(4,5,6,6,65,3, "Robin")
    names[0] ="Alex"
    println("first element is ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (number in numbers){
        if (number is String){
            println(number)
        }
    }
}