import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val string = sc.nextLine()
    val list = string.split(" ")
    println("${list[1]} ${list[0]}")
}