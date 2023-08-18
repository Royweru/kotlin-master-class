package oop

fun main(args: Array<String>) {
    val user = Master("gee")
    val friend = Master(firstName = "unus", lastName = "ng'ethe")

    println("Name:${user.firstName}")

    println("Name:${friend.firstName}")
    println("lastName:${friend.lastName}")
}
class Master (var firstName:String, var lastName: String="LastName", var age:Int=0){

}