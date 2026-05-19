fun main() {
    val array1 = Array(3){IntArray(3){0}}
    val array2 = Array(3){IntArray(3){0}}
    for(i in 0..2) {
        val ints = readln().split(" ").map{ it.toInt() }
        for(j in 0..2) {
            array1[i][j] = ints[j]
        }
    }
    val a = readln()
    for(i in 0..2) {
        val ints = readln().split(" ").map{ it.toInt() }
        for(j in 0..2) {
            array2[i][j] = ints[j]
        }
    }
    for(i in 0..2) {
        for(j in 0..2) {
            print("${array1[i][j]*array2[i][j]} ")
        }
        println("")
    }
}