fun main() {
    try {
        var a = arrayOf(1,2)
        a[2] = 3
    }
    catch(e: Exception) {
        println(e.toString())
    }

    var x = null
    println(x?: 0.0)

    var list = mutableListOf(1,null,2,4,null,6,8,10,null)
    list.add(7,12)
    println(list.filterNotNull())
}