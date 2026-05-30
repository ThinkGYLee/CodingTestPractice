fun main() {
    val n = readLine()!!.toInt()
    val nums = readln().split(" ").map { it.toInt() }
    
    // Please write your code here.
    val a = nums.sorted()
    val t = mutableListOf<Int>()
    for(i in 0..n-1) {
        t.add(a[i] + a[2*n-1-i])
    }
    println(t.sortedDescending().first())
}