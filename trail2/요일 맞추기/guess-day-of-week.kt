fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val m1 = input[0]
    val d1 = input[1]
    val m2 = input[2]
    val d2 = input[3]

    // Please write your code here.
    
    val days1 = getDaysFromJan1st(m1, d1)
    val days2 = getDaysFromJan1st(m2, d2)
    
    val diff = days2 - days1
    
    println(date(diff))
}

fun getDaysFromJan1st(month: Int, day: Int): Int {
    var totalDays = 0
    
    for (m in 1 until month) {
        totalDays += endOfMonth(m)
    }
    
    totalDays += day
    return totalDays
}

fun endOfMonth(month: Int): Int {
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

fun date(count: Int): String {
    var check = count % 7
    if (check < 0) {
        check += 7
    }
    
    return when(check) {
        0 -> "Mon"
        1 -> "Tue"
        2 -> "Wed"
        3 -> "Thu"
        4 -> "Fri"
        5 -> "Sat"
        6 -> "Sun"
        else -> ""
    }
}
