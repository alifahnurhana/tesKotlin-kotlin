fun main() {
    val users = mapOf(
            "surya" to User(
                    name = "Surya",
                    age = 17,
                    address = "Lonndon"),
            "alifah" to User(
                    name = "Alifah",
                    age = 15,
                    address = "Seoul")
    )


    println(users["surya"]?.address)
    println(users["alifah"]?.age)

}

data class User(val name: String,
                val age: Int,
                val address: String)