fun main() {
    val ints = readln().split(" ").map { it.toInt() }
    val a = ints[0]
    val b = ints[1]
    var array = IntArray(10)
    array[0] = a
    array[1] = b
    
    for(i in 1..10) {
        when(i) {
            1 -> print("$a ") 
            2 -> print("$b ")
            else -> {
                var sum = array[i-3] + array[i-2]
                array[i-1] = sum%10
                print("${array[i-1]} ")
            }
        }
    }
}