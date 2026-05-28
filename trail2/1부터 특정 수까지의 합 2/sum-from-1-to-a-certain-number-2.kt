fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    println(sumF(n))
}

fun sumF (n:Int): Int {
    if (n == 1) {
        return 1
    }
    
    return n + sumF(n - 1)
} 