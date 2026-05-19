fun main() {
    val array = Array(5){Array(3){""}}
    for(i in 0..4) {
        val strings = readln().split(" ").map {it.toUpperCase()}
        array[i][0] = strings[0]
        array[i][1] = strings[1]
        array[i][2] = strings[2]
    }
    for(i in 0..4) {
        for(j in 0..2) {
            print("${array[i][j]} ")
        }
        println("")
    }
}