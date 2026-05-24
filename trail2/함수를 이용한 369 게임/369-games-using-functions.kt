fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.
    var count = 0
    for(i in a..b) {
        if(
            isNumberHas3(i) ||
            isNumberHas6(i) ||
            isNumberHas9(i) ||
            isNumberDivide3is0(i)
        ) {
            count++
        }
    }
    println(count)
}

fun isNumberHas3(number: Int): Boolean {
    var current = number
    var truth = false
    while(current>0) {
        if(current%10 == 3) {
            truth = true
            break
        } 
        current = current/10
    }
    return truth
}

fun isNumberHas6(number: Int): Boolean {
    var current = number
    var truth = false
    while(current>0) {
        if(current%10 == 6) {
            truth = true
            break
        
        } 
        current = current/10
    }
    return truth
}

fun isNumberHas9(number: Int): Boolean {
var current = number
var truth = false
    while(current>0) {
        if(current%10 == 9) {
            truth = true
            break
        } 
        current = current/10
    }
    return truth
}

fun isNumberDivide3is0(number: Int): Boolean {
    return number%3 == 0
}