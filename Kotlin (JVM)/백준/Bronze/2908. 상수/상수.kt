fun main() {
    val split = readLine()!!.split(" ")
    val a = split[0]
    val b = split[1]
    val aReverse = a.reversed().toInt()
    val bReverse = b.reversed().toInt()
    if (aReverse > bReverse) {
        println(aReverse)
    } else {
        println(bReverse)
    }
}