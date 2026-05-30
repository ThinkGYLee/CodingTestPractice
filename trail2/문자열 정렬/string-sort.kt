fun main() {
    val inputString = readLine()!!
    // Please write your code here.
    val a = inputString.toCharArray().sorted()
    a.forEach{
        print("$it")
    }
}