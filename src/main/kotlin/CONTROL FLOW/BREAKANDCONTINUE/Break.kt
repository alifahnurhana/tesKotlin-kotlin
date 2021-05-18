fun main() {
    val jungkook = listOf(1, 2, 3, 5, 6, 7, null, 8, 9, 10 )
    val taehyung = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19,null, 20)

    for (i in jungkook){
        if (i == null)break//untuk berhenti di tepat null
        println(i)
    }

    for(i in taehyung){
        if (i == null)continue
        println("kim taehyung $i")
    }
}