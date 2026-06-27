fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    for(i in 0..n-1) {
        for(j in 0..m-1) {
            print("* ")
        }
        println()
    }
}