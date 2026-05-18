fun main() {
    val nm = readln().split(" ").map{ it.toInt() }
    val array1 = Array(nm[0]){IntArray(nm[1]){0}}
    val array2 = Array(nm[0]){IntArray(nm[1]){0}}
    val array3 = Array(nm[0]){IntArray(nm[1]){0}}
    for(i in 0..nm[0]-1) {
        val ints = readln().split(" ").map{it.toInt()}
        for(j in 0..nm[1]-1) {
            array1[i][j] = ints[j]
        }
    }
    for(i in 0..nm[0]-1) {
        val ints = readln().split(" ").map{it.toInt()}
        for(j in 0..nm[1]-1) {
            array2[i][j] = ints[j]
        }
    }
    for(i in 0..nm[0]-1) {
        for(j in 0..nm[1]-1) {
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