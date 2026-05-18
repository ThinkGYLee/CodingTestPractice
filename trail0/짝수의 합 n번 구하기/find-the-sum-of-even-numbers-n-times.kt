fun main() {
    val n = readln().toInt()
    for(i in 1..n) {
        val ints = readln().split(" ").map { it.toInt() }
        var count = 0
        for(j in ints[0]..ints[1]){
            if(j%2 == 0) {
                count = count+j
            }
        }
        println(count)
    }
}