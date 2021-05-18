fun main() {
    val jin = Bantan.MEMBERJIN
    val rm = Bantan.MEMBERRM
    val suga = Bantan.MEMBERSUGA
    val jhope = Bantan.MEMBERJHOPE
    val jimin = Bantan.MEMBERJIMIN
    val v = Bantan.MEMBERV
    val jungkook = Bantan.MEMBERJUNGKOOK

    jin.printValue()
    rm.printValue()
    suga.printValue()
    jhope.printValue()
    jimin.printValue()
    v.printValue()
    jungkook.printValue()

}
enum class Bantan(val value: String){
    MEMBERJIN("kim seokjin"){
        override fun printValue(){
         println(value)
        }
    },
    MEMBERRM("kim namjoon"){
        override fun printValue() {
            println(value)
        }
    },
    MEMBERSUGA("min yoongi"){
        override fun printValue() {
            println(value)
        }
    },
    MEMBERJHOPE("JUNG HOSEOK"){
        override fun printValue() {
            println(value)
        }
    },
    MEMBERJIMIN("PARK JIMIN"){
        override fun printValue() {
            println(value)
        }
    },
    MEMBERV("KIM TAEHYUNG"){
        override fun printValue() {
            println(value)
        }
    },
    MEMBERJUNGKOOK("JEON JUNGKOOK"){
        override fun printValue() {
            println(value)
        }
    };
    abstract fun printValue()
}