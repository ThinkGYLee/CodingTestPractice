fun main() {
    val array = Array(3) { IntArray(3) { 0 } }
    for(i in 1..3) {
        val ints = readln().split(" ").map { it.toInt() }
        array[i-1][0] = ints[0]*3
        array[i-1][1] = ints[1]*3
        array[i-1][2] = ints[2]*3
    }
    for(i in 0..2) {
        for(j in 0..2) {
            print("${array[i][j]} ")
        }
        println("")
    }

}