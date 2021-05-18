fun main() {
    val boygroup = Member.values()
    boygroup.forEach { bts ->
        println(bts.value)

    }
}
enum class Member(val value: String){
    RM("KIM NAMJOON"),
    JIN("KIM SEOKJIN"),
    SUGA("MIN YOONGI"),
    JHOPE("JUNG HOSEOK"),
    JIMIN("PARK JIMIN"),
    V("KIM TAEHYUNG"),
    JUNGKOOK("JEON JUNGKOOK"),
    BTS("BTS YEYEYYE")
}