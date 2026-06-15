fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.toMutableList()
    // Please write your code here.
    for (i in 1 until n) {
        val key = arr[i]
        var j = i - 1

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        
        arr[j + 1] = key
    }

    println(arr.joinToString(" "))
}