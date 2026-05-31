var max = 0
fun main() {
    val n = readLine()!!.toInt()
    val arr = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    // Please write your code here.
    findMax(0, arr)
    println(max)
}
fun findMax(i: Int, arr: List<Int>) {
    if(i == arr.size) return
    if(max < arr[i]) max = arr[i]
    findMax(i+1, arr)
}