package Inheritance

class Dog(legs: Int, color: String): Animals(legs,color) {
    override fun sounds() {
        println("I bark")
    }
}