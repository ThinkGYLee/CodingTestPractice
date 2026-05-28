fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    printD(n)
}

fun printD(n: Int) {
    if (n==0) return
    print("$n ") 
    printD(n-1)
    print("$n ")
}