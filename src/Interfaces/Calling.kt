package Interfaces

class Calling: MyInterface, NewInterface {
    override fun hello() {
        println("In Kotlin")
    }

    override fun greeting() {
        println("Hello")
    }

    override fun newMethod() {
        println("In function of newInterface")
    }
}