fun main() {
    val jeonjungkook = 1.rangeTo(28) step 7//dilangkahi 7 kali
    val kimtaehyung = 1.rangeTo(26) step 6//dilangkahi 6 kali
    val parkjimin = 1.rangeTo(24) step 5// dilangkahi 5 kali

    jeonjungkook.forEach { value ->
        println("jungkook $value")
    }

    kimtaehyung.forEach {value ->
        println("Taehyung $value")
    }

    parkjimin.forEach{value ->
        println("Jimin $value")
    }
}