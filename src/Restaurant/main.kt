package Restaurant

fun main() {
    var res1 = Restaurant("Res1",3.0, 200)
    var res2 = Restaurant("Res2",4.0, 250)
    var res3 = Restaurant("Res3",4.2, 220)
    var res4 = Restaurant("Res3",4.2, 220)


    var resList = mutableListOf(res1, res2, res3)

    for(res in resList) {
        println(res)
    }

    if(res3 == res4)
        println("Same")
    else
        println("Different")
}