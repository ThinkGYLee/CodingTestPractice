fun main() {
    val a = readln().toInt()
    for(i in 0..a-1) {
        for(j in 0..a-1-i) {
            print("* ")
        }
        println("")
    }
}