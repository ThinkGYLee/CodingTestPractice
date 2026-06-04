fun main() {
    val (m1, d1, m2, d2) = readLine()!!.split(" ").map { it.toInt() }
    
    // Please write your code here.
    var currentM = m1
    var currentD = d1
    var count = 1
    while(true) {
        if(currentM == m2 && currentD == d2) {
            break
        }
        currentD++
        count++
        if(lastDay(currentM) == currentD) {
            currentM++
            currentD = 0
        }
    }
    println(count)
}

fun lastDay(month: Int): Int {
    return when(month) {
        1 -> 31
        2 -> 28
        3 -> 31
        4 -> 30
        5 -> 31
        6 -> 30
        7 -> 31
        8 -> 31
        9 -> 30
        10 -> 31
        11 -> 30
        12 -> 31
        else -> 0
    }
}