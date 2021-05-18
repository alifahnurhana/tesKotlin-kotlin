fun main() {
    val fah = 1.rangeTo(13)

    for(name in fah){

        if (name %2==0) continue//untuk mengambil genap

        if (name > 13)break//apakah name lebih besar dari 13

        val result = name *(name + 6)//kali dan tambah

        println("hello $result")
    }
}