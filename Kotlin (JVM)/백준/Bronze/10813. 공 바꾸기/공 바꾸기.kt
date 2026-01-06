fun main() {
    val nm = readln().split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()
    val hash = HashMap<Int, Int>()
    var i = 1
    while (i <= n) {
        hash[i] = i
        i++
    }
    for(j in 1..m) {
        val query = readln().split(" ")
        val a = query[0].toInt()
        val b = query[1].toInt()
        val aVal = hash[a]
        val bVal = hash[b]
        hash.replace(a, bVal!!)
        hash.replace(b, aVal!!)
    }
    for(i in 1 .. n) {
        print(hash[i])
        print(" ")
    }
}