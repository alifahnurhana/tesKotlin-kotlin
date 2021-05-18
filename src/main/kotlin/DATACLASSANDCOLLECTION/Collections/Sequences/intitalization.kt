fun main() {
    val jumlahNama = (1..20).toList()
    jumlahNama.asSequence().filter {it % 4 == 0 }.map {it + it }.forEach {println(it)}

    val alifah = (1..20).toList()
    for(hm in alifah)
        if (hm %2 == 0)continue
    println()
}
// {it % 4 == 0} "untuk melipat gandakan 4"

//asSequence ini untuk mempercepat proses