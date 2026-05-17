fun main() {
    val n = readln().toInt()
    val ints = readln().split(" ").map{ it.toInt() }
    for(i in 0..n-1) {
        print("${ints[i]*ints[i]} ")
    }
}