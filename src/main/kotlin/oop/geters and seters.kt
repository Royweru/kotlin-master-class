package oop

fun main(args: Array<String>) {
    val me = Animal("tiger", lastName =  "gui", age = 44)
    me.firstName = "Derick"
    println(me.firstName)
}

class Animal(firstName:String, var lastName:String ="lastlast", var age:Int =22 ){
    var firstName = firstName

        get() {
            return "Firstname:$field"
        }
        set(value) {
            println("$value was added")
            field = value
        }

}