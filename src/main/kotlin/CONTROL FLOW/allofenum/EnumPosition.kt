fun main() {
    val jungkook: Posisi = Posisi.PENYANYIAWAL
    val taehyung: Posisi = Posisi.PENYANYIKETIGA
    val jimin: Posisi = Posisi.PENYANYIKEDUA
    val jhope: Posisi = Posisi.RAPANDDANCING
    val namjoon: Posisi = Posisi.RAPANDLEADER
    val suga: Posisi = Posisi.RAPAWAL
    val jin: Posisi = Posisi.PENYANYIKEEMPAT

    println("Posisi jungkook di BTS sebagai $jungkook")
    println("Posisi  taehyung di BTS sebagai $taehyung")
    println("Posisi jimin di BTS sebagai $jimin")
    println("Posisi jhope di BTS sebagai $jhope")
    println("Posisi RM di BTS sebagai $namjoon")
    println("Posisi suga di BTS sebagai $suga")
    println("Posisi jin di BTS sebagai $jin")


}
enum class Posisi(val value: String){
    PENYANYIAWAL("PENYAYI UTAMA"),
    PENYANYIKETIGA("BASS"),
    PENYANYIKEDUA("HALUS"),
    RAPANDDANCING("DANCE"),
    RAPANDLEADER("LEADER"),
    RAPAWAL("RAP"),
    PENYANYIKEEMPAT("PENYANYI BANTU")
}