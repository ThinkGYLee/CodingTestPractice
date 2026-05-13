import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val list = sc.nextLine().split(" ").map{ it.toInt() }
    val sum = list[0] + list[1] + list[2]
    val avg = sum/list.size
    val last = sum-avg
    println(sum)
    println(avg)
    println(last)
}