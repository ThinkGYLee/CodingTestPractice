fun main() {
    val nums = readln().split(" ").map{ it.toInt() }
    val h = nums[0]
    val w = nums[1]
    val b = (10000 * w) / (h*h)
    println(b)
    if(b>=25) {
        println("Obesity")
    }
}