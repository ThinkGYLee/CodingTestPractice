fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    var count = 0
    for(i in a..b) {
        if(isSosu(i) && isSumJjacksu(i)) count++
    }
    println(count)
}

fun isSosu(number: Int): Boolean {
    var count = 0
    if(number == 1) return false
    for(i in 2..number) {
        if(number%i == 0) {
            count++
        }
    }
    return count == 1
}

fun isSumJjacksu(number: Int): Boolean {
    var sum = 0
    var num = number
    while(num>0) {
        sum = sum + (num%10)
        num = num/10
    }
    return sum%2 == 0
}