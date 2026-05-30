fun main() {
    val word1 = readLine()!!
    val word2 = readLine()!!

    // Please write your code here.
    val x = word1.toCharArray().sorted()
    val y = word2.toCharArray().sorted()
    if(x==y) {
        println("Yes")
    } else {
        println("No")
    }
}