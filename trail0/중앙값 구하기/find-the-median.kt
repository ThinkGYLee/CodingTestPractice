fun main() {
    val ints = readln().split(" ").map { it.toInt() }.sortedByDescending{it}
    println(ints[1])
}