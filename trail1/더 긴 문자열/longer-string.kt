fun main() {
    val strings = readln().split(" ")
    val a = strings[0]
    val b = strings[1]
    if(a.length > b.length) {
        print("$a ${a.length}")

    } else if(b.length > a.length) {
        print("$b ${b.length}")
    } else {
        print("same")
    }
}