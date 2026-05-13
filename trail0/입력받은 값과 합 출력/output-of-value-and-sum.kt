import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val string = sc.nextLine()
    val list = string.split(" ")
    val mappedList = list.map{ it.toInt() }
    println("${mappedList[0]} ${mappedList[1]} ${mappedList[0] + mappedList[1]}")
}