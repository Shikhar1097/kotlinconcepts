fun main() {
    var num = 14;

    when(num) {
        0 -> println("zero")
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> println("None")
    }

    num = 0

    when {
        num > 0 -> println("positive")
        num < 0 -> println("negative")
        else -> println("equal to 0")
    }

    num = 19

    when (num) {
        in 1..10 -> println("between 1 to 10")
        in 11..20 -> println("between 11 to 20")
        in 21..30 -> println("between 21 to 30")
        else -> println("greater than 30")
    }
}