import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val aScore = sc.nextLine().split(" ").map{ it.toInt() }
    val bScore = sc.nextLine().split(" ").map{ it.toInt() }
    if(aScore[0]> bScore[0] && aScore[1]> bScore[1]) {
        println(1)
    } else {
        println(0)
    }
}