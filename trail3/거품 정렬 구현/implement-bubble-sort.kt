fun main() {
    val n = readLine()!!.toInt()
    val arr = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    val sortedArr = arr.toMutableList()

    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (sortedArr[j] > sortedArr[j + 1]) {
                val temp = sortedArr[j]
                sortedArr[j] = sortedArr[j + 1]
                sortedArr[j + 1] = temp
            }
        }
    }

    println(sortedArr.joinToString(" "))
}