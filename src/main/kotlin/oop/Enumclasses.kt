package oop

fun main(args: Array<String>) {
    val direction = Direction.valueOf("east".uppercase())
    when(direction){
        Direction.EAST-> println("The direction is East")
        Direction.WEST -> println("The direction is West")
        Direction.NORTH -> println("The direction is North")
        Direction.SOUTH -> println("The direction is South")
    }

}

enum class Direction(var direction: String, var  distance:Int){
    NORTH("north",22),
    SOUTH("south",44),
    EAST("East",30),
    WEST("west",50);

    fun printData(){
        println("Direction =$direction and Distance =$distance")
    }
}