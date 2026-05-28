fun main() {
    val n = readLine()!!.toInt()
    
    // Please write your code here.
    drawStar(n)
}

fun drawStar(n: Int) {
    if(n==0) return
    drawStar(n-1)
    for(i in 1..n) {
        print("*")
    }
    println("")
}