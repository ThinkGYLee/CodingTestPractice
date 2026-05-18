fun main() {
    val a = readln().toInt()
    for(i in 0..a-1) {
        val count = if(i == 0) {
            i
        } else {
            i*2
        }
        for(j in 0..count) {
            print("*")
        }
        println("")
    }
}