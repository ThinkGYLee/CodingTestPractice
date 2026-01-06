fun main() {
    val total = readln()!!
    val list = readln().split(" ")
    val findNumber = readln()!!
    var count = 0
    var i = total.toInt()
    while(i>0) {
        if(list[i-1].toInt() == findNumber.toInt()) count++
        i--
    }
    println(count)
}