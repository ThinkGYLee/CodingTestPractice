fun main() {
    val nm = readLine()!!.split(" ")
    val bucketCount = nm[0].toInt()
    val totalSwap = nm[1].toInt()
    val map = HashMap<Int, Int>()
    for(j in 1 .. bucketCount) {
        map.put(j, j)
    }

    var i = totalSwap
    while(i>0) {
        val range = readLine()!!.split(" ")
        var left = range[0].toInt()
        var right = range[1].toInt()
        while(!(left == right || left > right)) {
            val prevLeft = map[left]
            val prevRight = map[right]
            map[left] = prevRight as Int
            map[right] = prevLeft as Int
            left++
            right--
        }
        i--
    }

    for(j in 1 .. bucketCount) {
        print(map[j])
        print(" ")
    }
}