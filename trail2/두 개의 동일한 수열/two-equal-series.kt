fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.
    val x = a.sorted()
    val y = b.sorted()
    if(x == y) {
        println("Yes")
    } else {
        println("No")
    }
}