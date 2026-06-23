fun main() {
    val (x1, x2, x3, x4) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    if (x2 < x3 || x4 < x1) {
        println("nonintersecting")
    } else {
        println("intersecting")
    }
}