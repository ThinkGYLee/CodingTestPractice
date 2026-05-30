fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val nums = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.
    val a = nums.sorted()
    println(a[k-1])
}