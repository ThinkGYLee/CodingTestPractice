var count = 0
fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    process(n)
    println(count)
}

fun process(n: Int) {
    if(n==1) {
        return
    } else {
        val a = if(n%2 ==0) {
            n/2
        } else {
            n/3
        }
        count++
        process(a)
    }
}