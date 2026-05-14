import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val money = scanner.nextInt()
    if(money >= 3000) {
        println("book")
    } else if (money >= 1000) {
        println("mask")
    } else {
        println("no")
    }
}