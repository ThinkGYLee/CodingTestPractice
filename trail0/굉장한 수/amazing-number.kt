fun main() {
    val n = readln().toInt()
    if(n%2 == 1 && n%3 == 0) {
        println("true")
    } else if (n%2 == 0 && n%5 ==0) {
        println("true")
    } else {
        println("false")
    }
}