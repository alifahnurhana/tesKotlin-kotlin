fun main() {
    val ifa = 1..1000 step 5

    ifa.forEach{
        println("$it")
    }
    println(ifa.step)
}