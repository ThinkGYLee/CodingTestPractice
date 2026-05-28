fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    sun(n)
    println("")
    yuk(1, n)
}

fun sun(n: Int) {
    if(n==0) return
    sun(n-1)
    print("$n ")
}

fun yuk(cursor: Int, max: Int) {
    if(cursor==max+1) return
    yuk(cursor+1, max) 
    print("$cursor ")
}