fun main() {
    val (nStr, kStr, t) = readLine()!!.split(" ")
    val n = nStr.toInt()
    val k = kStr.toInt()
    val words = List(n) { readLine()!! }
    // Please write your code here.
    val filteredWords = words.filter{ it.startsWith(t) }
    val sortedWords = filteredWords.sorted()
    println(sortedWords[k-1])
}