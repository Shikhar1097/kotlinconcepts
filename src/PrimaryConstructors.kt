class Dog(var breed: String, var color: String, var age: Int) {

    fun printfunc() {
        println("Dog Details: \nBreed = ${breed} \nColor: ${color} \nAge:${age} \n")
    }
}

fun main() {
    var dog = Dog("Husky", "White", 2)
    dog.printfunc()
    println("Dog Details: \nBreed = ${dog.breed} \nColor: ${dog.color} \nAge:${dog.age} \n")
}