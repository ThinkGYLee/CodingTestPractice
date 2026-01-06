fun main() {
    val nm = readln().split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()
    val bucket = HashMap<Int, Int>()
    var i = 1
    while(i<=n) {
        bucket[i] = 0
        i++
    }
    i = 0
    while(i<m) {
        val tmp = readln().split(" ")
        val start = tmp[0].toInt()
        val end = tmp[1].toInt()
        val inputNumber = tmp[2].toInt()
        for(j: Int in start..end) {
            bucket.replace(j, inputNumber)
        }
        i++
    }
    bucket.forEach {
        print(it.value)
        print(" ")
    }
}