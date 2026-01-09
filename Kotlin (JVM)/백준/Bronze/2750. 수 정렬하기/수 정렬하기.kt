fun main() {
    val n = readLine()!!.toInt()
    var i = n
    val list = mutableListOf<Int>()
    while(i>0) {
        val num = readLine()!!.toInt()
        list.add(num)
        i--
    }
    list.sort()
    list.forEach {
        println(it)
    }
}