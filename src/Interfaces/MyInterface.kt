package Interfaces

interface MyInterface {
    fun hello() // without default implementation

    fun greeting() = println("Hello World") // with a default implementation
}