class Bike {
    var company = "Royal Enfield"
    var model = "classic"
    var price = 198000

    fun details() {
        println("The ${model} model of ${company} costs around ${price}")
    }
}

fun main() {
    var bike = Bike()
    bike.price = 200000
    bike.details()
}