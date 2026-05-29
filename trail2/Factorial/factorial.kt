fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    println(factorial(n))
}

fun factorial(n: Int): Int {
    if(n==0) {
        return 1
    }
    if(n==1) {
        return 1
    }
    return n*factorial(n-1)
}