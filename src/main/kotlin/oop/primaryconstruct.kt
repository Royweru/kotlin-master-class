package oop

fun main(args: Array<String>) {
    val user = User("Kinuthia", "Mutua",12)
    val friend = User("jonte","Kama",23)

    println("Name: ${user.name}")
    println("Name: ${friend.name}")

}

class User(name:String, var lastName:String, var age:Int){
    var name:String

    init {
        if (name.lowercase().startsWith("k")){
            this.name = name

        }else{
            this.name = "user"
            println("Name does not start with k")
        }
    }
}
