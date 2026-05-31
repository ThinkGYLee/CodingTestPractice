fun main() {
    val input = readln().split(" ")
    val unlockCode = input[0]
    val linearColor = input[1][0]
    val time = input[2].toInt()
    // Please write your code here.
    val a = A(unlockCode, linearColor, time)
    println("code : ${a.code}")
    println("color : ${a.color}")
    println("second : ${a.time}")
}

data class A(
    val code: String,
    val color: Char,
    val time: Int
) 