fun main() {
    val n: Int
    val m: Int
    val ints = readln().split(" ").map{ it.toInt() }
    n = ints[0]
    m = ints[1]
    for(i in 1..n) {
        for(j in 1..m) {
            print("* ")
        }
        println("")
    }
}