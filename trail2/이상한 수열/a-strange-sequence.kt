fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf(0, 1, 2)
    
    add(list, n)
}

fun add(list: MutableList<Int>, n: Int) {
    if (list.size > n) {
        println(list[n])
        return
    }
    
    val nextN = list.size 
    val nextValue = list[nextN / 3] + list[nextN - 1]
    
    list.add(nextValue)
    add(list, n)
}
