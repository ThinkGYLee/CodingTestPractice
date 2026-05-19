fun main() {
    val array = Array(2){IntArray(4){0}}
    for(i in 0..1) {
        val ints = readln().split(" ").map { it.toInt()}
        array[i][0] = ints[0]
        array[i][1] = ints[1]
        array[i][2] = ints[2]
        array[i][3] = ints[3]
    }
    for(i in 0..1) {
        var sum = 0
        for(j in 0..3) {
            sum = sum+array[i][j]
        }
        val avg = sum.toFloat()/4.0f
        print("${String.format("%.1f", avg)} ")
    }
    println("")
    for(i in 0..3) {
        var sum = 0
        for(j in 0..1) {
            sum = sum+array[j][i]
        }
        val avg = sum.toFloat()/2.0f
        print("${String.format("%.1f", avg)} ")
    }
    println("")
    var totalSum = 0
    for(i in 0..1) {
        for(j in 0..3) {
            totalSum = totalSum + array[i][j]
        }
    }
    val totalAvg = totalSum.toFloat()/8.0f
    print("${String.format("%.1f", totalAvg)} ")
}