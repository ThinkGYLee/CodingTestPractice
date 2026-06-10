fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 0 until n) {
        val parts = readln().split(" ")
        when (parts[0]) {
            "push_back" -> {
                val a = parts[1].toInt()
                list.add(a)
            }
            "pop_back" -> {
                list.removeAt(list.size - 1)
            }
            "size" -> {
                println(list.size)
            }
            "get" -> {
                val k = parts[1].toInt()
                println(list[k - 1])
            }
        }
    }
    // Please write your code here.
}