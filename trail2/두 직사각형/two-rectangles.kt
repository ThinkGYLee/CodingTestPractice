fun main() {
    val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }
    val (a1, b1, a2, b2) = readln().split(" ").map { it.toInt() }

    // Please write your code here.
    if (x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1) {
        println("nonoverlapping")
    } else {
        println("overlapping")
    }
}