fun main() {
    //immutable lists
    println("IMMUTABLE LISTS")
    var imlist = listOf(1,2,3,4)
    println(imlist)
    println(imlist.get(1))
    println(imlist.indexOf(1))
    println(imlist.subList(1,3))

    //mutable lists
    println("MUTABLE LISTS")
    var mlist = mutableListOf(1,2,3,4)
    mlist[0] = 0
    println(mlist)
    mlist.add(5)
    println(mlist)
    mlist.add(1, 1)
    println(mlist)
    mlist.removeAt(1)
    println(mlist)
    mlist.remove(0)
    println(mlist)
}