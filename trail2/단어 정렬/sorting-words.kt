fun main() {
    val n = readLine()!!.toInt()
    val wordList = List(n) { readLine()!! }
    // Please write your code here.
    val a = wordList.sorted()
    a.forEach {
        println(it)
    }
}