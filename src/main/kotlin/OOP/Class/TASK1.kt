package OOP.ObjectEverywhere

/**
 * Buat class
 * @ClassName : Car
 * @attribute : maxSpeed: Double, color: String, name: String
 * @behaviour : brake (tampilkan maxSpeed), accelerate(tampilkan maxSpeed), turnLeft(color), turnRight(name)
 * */

class Car(var maxSpeed: Double, var color: String, val name: String) {

    fun brake() {
        println("ngeremmnya bisa $maxSpeed kl")
    }

    fun accelerate() {
        println("ngegas nya bisa sampe $maxSpeed")
    }

    fun turnleft() {
        println(color)
    }

    fun turnRight() {
        println(name)
    }
}

fun main() {
    val carIni = Car(12.22, "merah", "avanza")
    println(carIni.name)
    println(carIni.color)
    println(carIni.maxSpeed)
    carIni.brake()
    carIni.accelerate()
    carIni.turnRight()
    carIni.turnleft()


    val carItu = Car(1000.55, "Hijau", "lamborghini")
    println(carItu.name)
    println(carItu.color)
    println(carItu.maxSpeed)
    carItu.maxSpeed = 500.0
    println(carItu.maxSpeed)
    carItu.color = "hitam"
    println(carItu.color)

}


