fun main() {
    val ints = readln().split(" ").map{ it.toInt() }
    var a = ints[0]
    val b = ints[1]
    while(a<=b) {
        print("$a ")
        if(a%2 == 1) {
            a = a*2
        } else {
            a = a+3
        }
    }
}