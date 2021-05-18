fun main() {
    val user = setUser("jungkook", 27)
    println(user)

    printUser("jungkook")
}

fun setUser(name: String, age: Int) = "My bias name is $name, and he $age years old"

fun printUser(name: String){
    print("he from boygroup BTS $name")
}

