fun main() {
    val bts = listOf("Kim namjoon", "Kim seokjin", "Minyoongi", "jung heseok", "park jimin", "kim taehyung", "jeon jungkook")
    val umur = listOf(24, 25, 26, 27, 28, 29, 30, 50, 100)


    println(bts.count())//untuk menghitung jumlah didalam list
    println(umur.count{ it % 25 == 0})//untuk melipatggandakan

}