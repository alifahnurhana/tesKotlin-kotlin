fun main() {
    val jungkook = listOf(1,  2, 3, 4, 5, 6, 7, 8, 9, 10)

    val kookie = jungkook.filter {it % 2 == 0}//untuk mengambil nilai genap
    val bunny = jungkook. filterNot {it % 2 == 0 }//untuk mengambil bukan yang genap

    println(kookie)
    println(bunny)
}
