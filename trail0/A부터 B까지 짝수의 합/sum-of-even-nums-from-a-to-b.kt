fun main() {
    val a: Int
    val b: Int
    val ints = readln().split(" ").map{ it.toInt() }
    a = ints[0]
    b = ints[1]
    var sum = 0
    for(i in a..b) {
        if(i%2==0) {
            sum+=i
        }
    }
    println(sum)
}