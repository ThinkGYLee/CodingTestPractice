import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val strings = sc.nextLine().split(" ").map{ it.toInt() }
    val a = strings[0]
    val b = strings[1]
    if(a>b) {
        println(a*b)
    } else {
        println(b/a)
    }
}