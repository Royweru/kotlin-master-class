fun main(args: Array<String>) {
    val number = findMin(arrayOf(3,4,5,6,19,30,45))
    println(number)
}

fun findMax(numbers:Array<Int>):Int{
    var max = numbers[0]
    for (i in numbers){
        if (i>max){
            max =i
        }
    }
    return max
}

fun findMin (numbers:Array<Int>):Int{
    var min = numbers[0]
    for (num in numbers){
        if (num<min){
            min = num
        }
    }
    return min
}