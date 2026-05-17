fun main() {
    val list = mutableListOf<Int>()
    for(i in 1..10) {
        val input = readln().toInt()
        list.add(input)
    }
    var three = 0
    var five = 0
    list.forEach{
        if(it % 3 == 0) {
            three++
        }
        if(it % 5 ==0) {
            five++
        }
    }
    println("$three $five")
}