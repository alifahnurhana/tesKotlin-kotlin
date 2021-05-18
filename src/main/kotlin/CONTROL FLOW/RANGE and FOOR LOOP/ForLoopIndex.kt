fun main() {
    val fah = 1.rangeTo(5)step 2
    val bts = 1.rangeTo(1000)step 5

    for ((index, value) in fah.withIndex()){
        println("fahh cantiik $value banget $index")
    }

    for((index, value) in bts.withIndex()){
        println("BTS menang $value di grammy $index")
    }

}
