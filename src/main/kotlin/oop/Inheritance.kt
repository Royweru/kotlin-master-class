package oop

fun main(args: Array<String>) {
    val car = Car("bmw","yellow",5, 4)
    val plane = Plane("Emirates","green",4,10,"Bahamas")

   car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Car(val name:String, val color:String, val engines:Int, val doors:Int){
    open fun move(){
        println("$name is moving which is $color and has $engines engines")
    }
    open fun stop(){
        println("$name has stopped")
    }
}
class Plane(name: String, color: String, engines: Int, doors: Int, private val destination:String):Car(name,color,engines,doors){
    override fun move() {
        println("$destination is set")
        super.move()
    }

    override fun stop() {
        println("The plane has stopped at this destination $destination")
        super.stop()
    }
}