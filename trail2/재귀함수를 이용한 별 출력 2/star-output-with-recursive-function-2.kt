fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    printS(n)
}

fun printS(n: Int) {
    if(n==0) return
    for(i in 1..n) {
        print("* ")
    }
    println("")
    printS(n-1)
    for(i in 1..n) {
        print("* ")
    }
    println("")
}