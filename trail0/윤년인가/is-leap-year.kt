fun main() {
    val year = readln().toInt()
    if(year%100 == 0 && year % 400 != 0) {
        println("false")
    } else {
        if(year % 4 == 0) {
            println("true")
        } else {
            println("false")
        }
    }
}