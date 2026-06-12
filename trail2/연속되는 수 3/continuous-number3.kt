import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()
    val arr = MutableList(n) { readLine()!!.toInt() }
    
    // Please write your code here.
    var isCurrentPlus: Boolean = arr[0] > 0
    var currentSteak = 1
    var maxStreak = 1
    
    for (i in 1..arr.size - 1) {
        if ((arr[i] > 0) != isCurrentPlus) {
            maxStreak = max(maxStreak, currentSteak)
            isCurrentPlus = arr[i] > 0
            currentSteak = 1
        } else {
            currentSteak++
        }
    }
    maxStreak = max(maxStreak, currentSteak)
    
    // 정답 출력
    println(maxStreak)
}