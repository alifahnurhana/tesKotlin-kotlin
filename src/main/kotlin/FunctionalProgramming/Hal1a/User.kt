package FunctionalProgramming.Hal1a

data class User(val name: String,
                val age: Int,
                val address: String)

fun main() {

    val userList = listOf(
            User("Surya", 18, "Maros"),
            User("Akbar", 17, "Makassar"),
            User("Ifa", 13, "Korea")
    )

    userList.forEach { usr ->
        println("${usr.name} ${usr.age} ${usr.address}")
    }

}