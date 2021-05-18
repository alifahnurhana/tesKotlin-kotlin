fun main() {
    val ifah = listOf(1, 2, 3, 4, 5, 6, 7, null , null, 11, null, 1000, 12, null, 99)
    val bts = listOf(1, 3, null, 0, 6, null, 2, 0, 1, 3)

    for (i in ifah){
        if (i == null)continue//untuk melanjutkan
        println(i)
    }

    for(i in bts){
        if(i == null) continue
        println(i)
    }
}