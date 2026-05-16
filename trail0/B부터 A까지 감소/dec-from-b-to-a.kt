import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val strings = sc.nextLine().split(" ").map{ it.toInt() }
    for (i in strings[1] downTo strings[0]) {
        print("$i ")
    }
}