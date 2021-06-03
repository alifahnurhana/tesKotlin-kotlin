package FunctionalProgramming.Hal2a

fun main(){
    val bangtan = bts (b = "bang", t = "tan", s = "soenyoendan")
    print(bangtan)
}

fun bts(b : String, t : String, s : String) :String{
    return "${b.length} $t $s"

}