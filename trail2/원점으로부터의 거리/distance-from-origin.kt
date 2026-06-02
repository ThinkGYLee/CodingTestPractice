import kotlin.math.abs

fun main() {
    val n = readLine()!!.toInt()
    val points = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        points.add(Pair(x, y))
    }
    // Please write your code here.
    val mapped = points.map{
        Point(
            x = it.first,
            y = it.second,
            number = points.indexOf(it)+1
        )
    }
    val sorted = mapped.sortedWith(
        compareBy<Point>{ abs(0-it.x) + abs(0-it.y) }
            .thenBy{ it.number }
    )
    sorted.forEach{
        println("${it.number}")
    }
}

data class Point(
    val x: Int,
    val y: Int,
    val number: Int
)