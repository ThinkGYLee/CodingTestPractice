fun main() {
    val array = Array(4){IntArray(4){0}}
    for(i in 0..3) {
        val ints = readln().split(" ").map { it.toInt() }
        for(j in 0..3) {
            array[i][j] = ints[j]
        }
    }
    var count = 0
    for(i in 0..3) {
        for(j in 0..3) {
            if(j<=i) {
                count = count + array[i][j]
            }
        }
    }
    println(count)
}