fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    var currentD = 11
    var currentH = 11
    var currentM = 11
    var count = 0
    while(true) {
        if(isBefore(a,b,c)) {
            count = -1
            break
        }
        if(currentD == a && currentH == b && currentM == c) {
            break
        }
        
        currentM++
        count++
        if(currentM == 60) {
            currentH++
            currentM = 0
        }
        if(currentH == 24) {
            currentD++
            currentH =0
        }
    }
    println(count)
}
fun isBefore(day: Int, hour: Int, min: Int): Boolean {
    return if((day*24*60) + (hour*60) + min < (11*24*60)+(11*60)+11) {
        true
    } else {
        false
    }
}

