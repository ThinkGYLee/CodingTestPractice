fun main() {
    val ints = readln().split(" ").map{ it.toInt() }
    var totalCount = 0
    for(i in ints[0]..ints[1]) {
        var count = 0
        for(j in 1..i) {
            if(i%j ==0) {
                count++
            }
        }
        if(count ==3) {
            totalCount++
        }
        count = 0
    }
    println(totalCount)
}