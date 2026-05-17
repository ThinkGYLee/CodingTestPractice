fun main() {
    val n = readln().toInt()
    var count = 0
    for(i in 1..n) {
        if(i%2 == 0 || i%3 ==0 ||i%5 ==0) {
            count++
        }
    }
    println(n-count)
}