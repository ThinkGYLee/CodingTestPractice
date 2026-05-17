fun main() {
    val n = readln().toInt()
    var sum = 0
    for(i in 1..100) {
        sum = sum+i
        if(sum>=n) {
            println(i)
            break
        }
    }
}