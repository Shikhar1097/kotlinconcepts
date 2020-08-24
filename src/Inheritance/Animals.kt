package Inheritance

open class Animals(var legs: Int, var color: String) {
    fun eat() {
        println("I eat")
    }

    fun sleep() {
        println("I sleep")
    }

    open fun sounds() {
        println("I make a sound")
    }
}