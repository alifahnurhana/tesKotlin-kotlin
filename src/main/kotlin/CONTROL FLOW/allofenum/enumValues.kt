fun main() {
    val kelinci: Array<Sampingan> = enumValues()
    kelinci.forEach { kelinci ->
        println(kelinci)
    }

    val hewan: Sampingan = enumValueOf("JUNGKOOK")
    val anaksinga: Sampingan = enumValueOf("TAEHYUNG")

    println("kelincinya army adalah $hewan")
    println("anaksinganya army adalah $anaksinga")

}
enum class Sampingan(val value: String){
    JUNGKOOK("IS BUNNY"),
    TAEHYUNG("LION")
}

