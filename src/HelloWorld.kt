// Empty Program

// single line comment
/* multi
line
comment
 */

fun main() {
    // program code here
    printfun()
    println(timesTwo(2))
    println(timesThree(4))
}

fun printfun() {
    println("Hello World")
}

fun timesThree(num: Int): Int {
    return num * 3
}

fun timesTwo(num: Int) = num * 2