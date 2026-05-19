fun main() {
    val nm = readln().split(" ").map{ it.toInt() }
    val n = nm[0]
    val m = nm[1]
    val array1 = Array(n){IntArray(m){0}}
    val array2 = Array(n){IntArray(m){0}}
    val array3 = Array(n){IntArray(m){0}}
    for(i in 0..(2*n)-1) {
        val ints = readln().split(" ").map{ it.toInt() }
        for(j in 0..m-1) {
            if(i<n) {
                array1[i][j] = ints[j]
            } else {
                array2[i-n][j] = ints[j]
            }
        }
    }
    for(i in 0..n-1) {
        for(j in 0..m-1) {
            if(array1[i][j] == array2[i][j]) {
                array3[i][j] = 0
            } else {
                array3[i][j] = 1
            }
            print("${array3[i][j]} ")
        }
        println("")
    }
}