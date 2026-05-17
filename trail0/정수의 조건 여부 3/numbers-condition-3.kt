import java.util.*

fun main() {
    val a = readln().toInt()
    if((a%13) == 0 || (a%19) == 0) {
        println("True")
    } else {
        println("False")
    }
}