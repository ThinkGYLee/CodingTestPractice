fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    printH(n)
}

fun printH(n: Int) {
    if(n==0) return
    printH(n-1)
    println("HelloWorld")
}