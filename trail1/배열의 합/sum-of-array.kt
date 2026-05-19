fun main() {
    for(i in 1..4) {
        val ints = readln().split(" ").map{ it.toInt() }
        println(ints[0]+ints[1]+ints[2]+ints[3])
    }
}