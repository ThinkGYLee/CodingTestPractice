fun main() {
    val tokens = readln().split(" ")
    val secretCode = tokens[0]
    val meetingPoint = tokens[1][0]
    val time = tokens[2].toInt()
    
    // Please write your code here.
    println("secret code : $secretCode")
    println("meeting point : $meetingPoint")
    println("time : $time")
}