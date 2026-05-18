fun main() {
    val n = readln().toInt()
    var initial = 1
    for(i in 1..n) {
        for(j in 1..i) {
            print("$initial ")
            initial++
        }
        println("")
    }
}