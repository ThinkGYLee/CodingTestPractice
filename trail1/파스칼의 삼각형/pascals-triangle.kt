fun main() {
    val n = readln().toInt()
    val array = Array(n){IntArray(n){0}}
    for(i in 0..n-1) {
        for(j in 0..i) {
            var checkI = 0
            var checkJ = 0
            var sum = 0
            if(i>0 && j>0) {
                sum = array[i-1][j-1] + array[i-1][j]
            } else if(i>0 && j<=0) {
                sum = array[i-1][j]
            } else {
                sum = 1
            }
            array[i][j] = sum
        }
    }
    for(i in 0..n-1) {
        for(j in 0..i) {
            print("${array[i][j]} ")
        }
        println("")
    }
}