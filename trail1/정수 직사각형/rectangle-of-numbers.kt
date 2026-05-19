fun main() {
    val nm = readln().split(" ").map {it.toInt()}
    val n = nm[0]
    val m = nm[1]
    val array = Array(n){IntArray(m){0}}
    var current = 1
    for(i in 0..n-1 ){
        for(j in 0..m-1) {
            array[i][j] = current
            print("${array[i][j]} ")
            current++
        }
        println("")
    }
}