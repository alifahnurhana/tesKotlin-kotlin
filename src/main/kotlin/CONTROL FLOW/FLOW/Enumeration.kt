fun main() {
    val bangtan : Bangtan = Bangtan.LETGO
    println(bangtan)

    val bts: Bts = Bts.springday
    println(bts)

    val jungkook: Jungkook = Jungkook.mytime
    println(jungkook)

    val jimin: Jimin = Jimin.filter
    println(jimin)

    val taehyung: Taehyung = Taehyung.winterbear
    println(taehyung)

    val jhope: Jhope = Jhope.chikennoodlesoup
    println(jhope)

    val suga: Suga = Suga.dwechita
    println(suga)

    val namjoon: Namjoon = Namjoon.rain
    println(namjoon)

    val jin: Jin = Jin.moon
    println(jin)

}



enum class Bangtan{
    ON, NOTTODAY ,LETGO,
}

enum class Bts{
    springday
}
enum class Jungkook{
    mytime
}
enum class Jimin{
    filter
}
enum class Taehyung{
    winterbear
}
enum class Jhope{
    chikennoodlesoup
}
enum class Suga{
    dwechita
}
enum class Namjoon{
    rain
}
enum class Jin{
    moon
}