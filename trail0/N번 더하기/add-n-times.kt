import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val strings = sc.nextLine().split(" ").map{ it.toInt() }
    val a = strings[0]
    val n = strings[1]
    var sum = a+n

    for(i in 1..n) {
        println(sum)
        sum+=n
    }
}