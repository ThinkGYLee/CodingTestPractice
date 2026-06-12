fun main() {
    val n = readLine()!!.toInt()
    val numbers = List(n) { readLine()!!.toInt() }
    // Please write your code here.
    var counts = mutableListOf<Int>()
    var count = 1
    var current = numbers[0]
    for (i in 1 until numbers.size) {
        val it = numbers[i]
        
        if (it != current) {
            counts.add(count)
            count = 1  
            current = it
        } else {
            count++    
        }
    }
    
    counts.add(count)
    println(counts.maxOrNull() ?: 0)
}