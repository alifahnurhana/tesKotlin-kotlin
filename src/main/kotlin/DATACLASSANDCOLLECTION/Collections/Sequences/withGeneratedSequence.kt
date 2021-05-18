fun main() {
    val sequenceNumber = generateSequence(2) { it + 1 }
    val alifah = 1..10 step 2

    alifah.forEach{
        println("$it")
        println(alifah.step)
    }
    sequenceNumber.take(10).forEach { print("$it ") }
}