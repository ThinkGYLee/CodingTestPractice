fun main() {
    val nm = readln().split(" ").map{ it.toInt() }
    // 격자
    val n = nm[0]
    // 점의 개수
    val m = nm[1]
    // 점의 크기 = row x column
    val array = Array(n){IntArray(n){0}}
    for(i in 1..m) {
        val xy = readln().split(" ").map{ it.toInt() }
        val row = xy[0]
        val column = xy[1]
        array[row-1][column-1] = row*column
    }
    for(i in 0..n-1) {
        for(j in 0..n-1) {
            print("${array[i][j]} ")
        }
        println("")
    }
}