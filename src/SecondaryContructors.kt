class Cat {
    // class with only a secondary constructor
    var breed: String
    var color: String
    var age: Int

    constructor(breed: String, color: String, age: Int) {
        this.breed = breed
        this.color = color
        this.age = age
    }

    fun printfunc() {
        println("Dog Details: \nBreed = ${breed} \nColor: ${color} \nAge:${age} \n")
    }
}

class Parrot(var color: String, var age: Int) {
    // class with a primary as well as a secondary constructor
    var name: String? = null

    constructor(color: String, age: Int, name: String): this(color, age) {
        this.name = name
    }

    fun printfunc() {
        println("Parrot Details: \nColor: ${color} \nAge: ${age} \nName: ${name}")
    }
}

fun main() {
    var cat = Cat("Persian", "White", 2)
    cat.printfunc()

    var parrot1 = Parrot("green", 2)
    parrot1.printfunc()

    var parrot2 = Parrot("green", 2, "mitthu")
    parrot2.printfunc()
}