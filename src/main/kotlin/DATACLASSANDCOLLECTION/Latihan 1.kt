package DATACLASSANDCOLLECTION

fun main() {

    // TODO 1
    val vehicle = mapOf(
        "type" to "Motorcycle",  //type = keys , motorcycle = values
        "max" to "230Km/s",
        "maxTank" to "10Ltr"// untuk mnampilkan
    )

    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle.getValue("max")
    val maxTank = vehicle["maxTank"]

    // TODO 3
    println("Vehicle")
    println("Type: $type")
    println("Maximal Speed: $maxSpeed")
    println("Maximal Tank: $maxTank")


}