fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    println(a(n))
}
fun a(n: Int): Int {
    if(n / 10 == 0) return (n%10)*(n%10)

    return (n%10)*(n%10) + a(n/10)
}