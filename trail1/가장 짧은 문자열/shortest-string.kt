import java.lang.*

fun main() {
    val a = readln()
    val b = readln()
    val c = readln()
    val list = listOf(a.length, b.length, c.length)
    val max = list.maxOrNull()!!
    val min = list.minOrNull()!!
    println(max-min)
}