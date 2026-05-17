fun main() {
    val strings = readln().split(" ")
    val a = strings[0]
    val b = strings[1]
    if(a.length > b.length) {
        println("$a ${a.length}")
    } else if(a.length < b.length) {
        println("$b ${b.length}")
    } else {
        println("same")
    }
}