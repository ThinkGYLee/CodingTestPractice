fun main() {
    val nums = readln().split(" ").map{ it.toInt() }
    val a = nums[0]
    val b = nums[1]
    if(a>=b) {
        println(a-b)
    } else {
        println(b-a)
    }
}