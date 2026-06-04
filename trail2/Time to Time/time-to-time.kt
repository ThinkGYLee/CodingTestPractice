fun main() {
    val (a, b, c, d) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    var currentH = a
    var currentM = b
    var count = 0
    while(true) {
        if(currentH == c && currentM == d) {
            break
        }
        if(currentM == 60) {
            currentH++
            currentM = 0
        }
        currentM++
        count++
    }
    println(count)
}