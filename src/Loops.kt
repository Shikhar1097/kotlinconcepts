import `Visibility Modifiers`.mult

fun main() {
    println("FOR")
    // prints from 1 to 10
    for(i in 1..10) {
        println(i)
    }

    println("with until")
    // prints from 1 to 9
    for(i in 1 until 10) {
        println(i)
    }

    println("with step")
    //increment by 2,3...
    for(i in 1..10 step 2) {
        println(i)
    }

    println("WHILE")
    var i = 0
    while( i <= 10) {
        println(i)
        i++
    }

    println("DO..WHILE")
    i = 0;
    do {
        println(i)
        i++
    } while (i <= 10)

    println("DECREMENT")
    for (i in 10 downTo 1) {
        println(i)
    }
}