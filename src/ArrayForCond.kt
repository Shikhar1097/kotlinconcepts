import java.util.*

fun main() {
    // Write your code here
    calc("I am a Kotlin programmer now")
}

fun calc(str: String) {
    var arr = IntArray(str.length)
    var temp = "aeiouAEIOU"
    var count = 0
    var sum = 0
    // for(i in 0 until str.length)
    for(i in 0..str.length-1) {
        if (temp.indexOf(str.get(i)) != -1) {
            arr[count] = i
            sum += i
            count++;
        }
    }

    println(Arrays.toString(arr))
    println(sum)
}