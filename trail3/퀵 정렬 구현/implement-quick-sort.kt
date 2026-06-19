fun main() {
    val n = readLine()!!.toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    val arr = numbers.toMutableList()

    quickSort(arr, 0, n - 1)

    println(arr.joinToString(" "))
}

fun getPivotIndex(arr: MutableList<Int>, left: Int, right: Int): Int {
    val size = right - left + 1

    if (size <= 3) {
        return right
    }

    val mid = (left + right) / 2

    val candidates = listOf(
        Pair(arr[left], left),
        Pair(arr[mid], mid),
        Pair(arr[right], right)
    ).sortedBy { it.first }

    return candidates[1].second
}

fun partition(arr: MutableList<Int>, left: Int, right: Int): Int {
    val pivotIndex = getPivotIndex(arr, left, right)

    val temp = arr[pivotIndex]
    arr[pivotIndex] = arr[right]
    arr[right] = temp

    val pivot = arr[right]
    var i = left - 1

    for (j in left until right) {
        if (arr[j] < pivot) {
            i++

            val swapTemp = arr[i]
            arr[i] = arr[j]
            arr[j] = swapTemp
        }
    }

    val swapTemp = arr[i + 1]
    arr[i + 1] = arr[right]
    arr[right] = swapTemp

    return i + 1
}

fun quickSort(arr: MutableList<Int>, left: Int, right: Int) {
    if (left >= right) return

    val pivotPos = partition(arr, left, right)

    quickSort(arr, left, pivotPos - 1)
    quickSort(arr, pivotPos + 1, right)
}