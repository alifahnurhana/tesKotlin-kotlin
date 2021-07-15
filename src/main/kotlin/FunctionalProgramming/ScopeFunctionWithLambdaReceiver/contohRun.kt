package FunctionalProgramming.ScopeFunctionWithLambda

import kotlin.time.measureTimedValue

fun main(){
    val awal = "Alifah Nurhana Hawangtika"
    val jadi = awal.run{
        val from = this
        val to = this.replace("Alifah Nurhana Hawangtika", "Isrti Jungkook")
        "akhirnya, $from sah menjadi $to aka (Nyonya jeon jungkook) "
    }

    println( "$jadi TERUS BERMIMPI SAMPE TUHAN BERKATA DIA MEMANG JODOH MU")
}