package `Visibility Modifiers`

fun main() {
    val c = sum(2,3)
//    val d = sub(3,2)
    val e = mult(2,3)

    var pro = Product()
//    pro.prod(2,4)
}

class Product {
    protected fun prod(a: Int, b: Int) = a * b
}