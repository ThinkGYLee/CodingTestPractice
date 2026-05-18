fun main() {
    val array1 = Array(3){IntArray(3){0}}
    val array2 = Array(3){IntArray(3){0}}
    var count = 0
    while(count < 7) {
        
        when(count) {
            0 -> {
                val ints = readln().split(" ").map{ it.toInt() }
                array1[0][0] = ints[0]
                array1[0][1] = ints[1]
                array1[0][2] = ints[2]
            }
            1 -> {
                val ints = readln().split(" ").map{ it.toInt() }
                array1[1][0] = ints[0]
                array1[1][1] = ints[1]
                array1[1][2] = ints[2]
            }
            2 -> {
                val ints = readln().split(" ").map{ it.toInt() }
                array1[2][0] = ints[0]
                array1[2][1] = ints[1]
                array1[2][2] = ints[2]
            }
            3 -> {
                val ints = readln()
            }
            4 -> {
                val ints = readln().split(" ").map{ it.toInt() }
                array2[0][0] = ints[0]
                array2[0][1] = ints[1]
                array2[0][2] = ints[2]
            }
            5 -> {
                val ints = readln().split(" ").map{ it.toInt() }
                array2[1][0] = ints[0]
                array2[1][1] = ints[1]
                array2[1][2] = ints[2]
            }
            6 -> {
                val ints = readln().split(" ").map{ it.toInt() }
                array2[2][0] = ints[0]
                array2[2][1] = ints[1]
                array2[2][2] = ints[2]
            }
        }
        count++
    }
    for(i in 0..2) {
        for(j in 0..2) {
            print("${array1[i][j] * array2[i][j]} ")
        }
        println("")
    }
}