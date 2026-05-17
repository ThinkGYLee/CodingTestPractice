fun main() {
    var a = 0
    while(a!=25) {
        a = readln().toInt()
        if(a< 25) {
            println("Higher")
        } else if(a > 25) {
            println("Lower")
        } else {
            println("Good")
        }
    }
}