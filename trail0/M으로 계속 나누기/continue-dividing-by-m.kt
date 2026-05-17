fun main() {
    val (nStr, mStr) = readln().split(" ")
    var n = nStr.toInt()
    val m = mStr.toInt()
    
    // Please write your code here.
    while(n>0) {
        println(n)
        n = n/m
    }
}