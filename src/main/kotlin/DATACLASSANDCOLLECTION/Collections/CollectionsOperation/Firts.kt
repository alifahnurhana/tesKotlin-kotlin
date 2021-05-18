fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList.first { it > 5 }//kenapa outpunya 5 karna dia ambil mulai dari lbeih 5
    print(moreThan10)
}