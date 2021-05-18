fun main() {
    val taehyung = setOf(2,3, 4, 5, 200, 38,2, 38)
    val jungkook = setOf(6, 9, 8, 4, 9, 3)
    println(taehyung)
    println(jungkook)

    val v = setOf(1, 2, 3, 4, 5, 8)
    val kookie = setOf(1, 2, 3, 4, 5, 8 )
    println(v == kookie)

    println(8 in v)

    val suga = setOf(1, 9, 10)

    val union =  v.union(suga)//untuk menggabungkan v sama suga
    val intersect = v.intersect(suga)//untuk melihat kesamaan v sama suga

    println(union)
    println(intersect)
}