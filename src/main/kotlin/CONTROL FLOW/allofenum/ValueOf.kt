fun main() {
    val dynamite: Dynamite = Dynamite.valueOf("LIRIK")
    val magicShop: Dynamite = Dynamite.valueOf("LIRIKMAGICSHOP")
    val loveMySelf: Dynamite = Dynamite.valueOf("LIRIKLOVEMYSELF")
    val soFarAway: Dynamite = Dynamite.valueOf("LIRIKSOFARAWAY")



    println("Lirik reff di lagu dynamite $dynamite LIGHT IT UP LIKE DYNAMITE")
    println("so show me i show you $magicShop")
    println("you've shown me I have reasons I should love myself $loveMySelf,")
    println("sijageun miyakhaljieonjeong kkeuteun changdaehari $soFarAway")
}
enum class Dynamite(val value: String) {
    LIRIK("LAGUNYA BTS YANG MENANG BILLIBOARD" ),
    LIRIKMAGICSHOP("show you show you"),
    LIRIKLOVEMYSELF("I’m learning how to love myself"),
    LIRIKSOFARAWAY("Meski awalnya lemah, akhirnya sangat bagus")
}
