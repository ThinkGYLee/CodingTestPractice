fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    println(pibonacci(n))
}

fun pibonacci(n: Int): Int {
    if(n == 1 || n == 2) {
        return 1
    } 
    return pibonacci(n-2) + pibonacci(n-1)
}