fun main() {
    val lifeGoesOn = 1.rangeTo(100)step 1
    val dynamite = 1.rangeTo(1000)step 2

    lifeGoesOn.forEachIndexed{index, value ->
        println("my favorit song $value diantara beribu lagu bts$index")
    }

    dynamite.forEachIndexed{index, value ->
        println("like it up l$value like dynamite $index")
    }

}