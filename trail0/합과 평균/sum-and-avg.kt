import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val list = sc.nextLine().split(" ")
    val mappedList = list.map{ it.toInt() }
    println("${mappedList[0] + mappedList[1]} ${(mappedList[0].toFloat()+mappedList[1].toFloat())/2}")
}