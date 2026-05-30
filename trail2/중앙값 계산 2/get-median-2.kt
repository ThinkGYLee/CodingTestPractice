fun main() {
    val n = readLine()!!.toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    for(i in 0..n-1) {
        if(i%2 == 0) {
            val current = numbers.filter{ numbers.indexOf(it) <= i }
            val sorted = current.sorted()
            print("${sorted[i/2]} ")
        }
    }
}