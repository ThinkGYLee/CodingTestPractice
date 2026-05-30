var sum = 0
fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    if(n % 2 ==0) {
        process(2, n)
    } else {
        process(1, n)
    }
    print(sum)
}
fun process(i: Int, n:Int) {
    if(i>n) return 
    sum = sum + i
    process(i+2, n)
}
