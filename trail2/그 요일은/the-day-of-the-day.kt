fun main() {
    val (m1, d1, m2, d2) = readln().split(" ").map { it.toInt() }
    val a = readln()
    // Please write your code here.
    var count = 0
    var currentM = m1
    var currentD = d1
    var currentDate = "Mon"
    while(true) {
        if(currentDate == a) {
            count++
        }

        if(currentM == m2 && currentD == d2) {
            break
        }
    
        currentD++
        currentDate = nextDate(currentDate)
        
        if(currentD > endOfMonth(currentM)) {
            currentD = 1
            currentM++
        }
    }
    println(count)
}

fun endOfMonth(month: Int): Int{
    return when(month) {
        1 -> 31
        2 -> 29
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

fun nextDate(date: String): String {
    return when(date) {
        "Mon" -> "Tue"
        "Tue" -> "Wed"
        "Wed" -> "Thu"
        "Thu" -> "Fri"
        "Fri" -> "Sat"
        "Sat" -> "Sun"
        "Sun" -> "Mon"
        else -> ""
    }
}