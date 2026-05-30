fun main() {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map { it.toInt() }
    
    // Please write your code here.
    nums.sorted().forEach{
        print("$it ")
    }
    println("")
    nums.sortedDescending().forEach{
        print("$it ")
    }
}