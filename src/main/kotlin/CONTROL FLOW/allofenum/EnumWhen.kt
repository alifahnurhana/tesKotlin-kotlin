fun main() {
    val artis: Nominasi = Nominasi.BTS
    val pendatang: Nominasi = Nominasi.TXT

    when(pendatang){
        Nominasi.BTS -> println("BTS peringkat 1")
        Nominasi.NCT -> println("NCT peringkat 2")
        Nominasi.TXT -> println("TXT peringkat 3")
    }
}
enum class Nominasi(val value: String){
    BTS("pertama"),
    NCT("kedua"),
    TXT("ketiga")
}