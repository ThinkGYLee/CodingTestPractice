fun main() {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.
    val aSize = a.size
    val bSize = b.size
    var truth = false
    for(i in 0..aSize-bSize) {
        if(isPart(i, a, b)) truth = true
    }
    if(truth) {
        println("Yes")
    } else {
        println("No")
    }
}

fun isPart(start: Int, x: List<Int>, y: List<Int>): Boolean {
    val size = y.size
    var count = 0
    for(i in start..start+size-1) {
        if(x[i] == y[i-start]) count++
    }
    return count == size
}