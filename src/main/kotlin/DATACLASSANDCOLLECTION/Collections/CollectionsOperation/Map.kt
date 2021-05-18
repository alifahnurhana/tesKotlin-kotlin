fun main() {
    val bts = listOf("jin", "suga", "rm", "jhope", "jimin", "taehyung", "jungkook")
    val sing = bts.map {
        if(it == "suga" || it == "rm" || it == "jhope")//untuk bisa menambanh kan rap
            "$it Rap"

        else//selain itu di akan vocal
            "$it Vocal"
    }

    println(sing)
}