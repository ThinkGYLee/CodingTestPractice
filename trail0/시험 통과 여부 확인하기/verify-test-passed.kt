import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val i = sc.nextInt()
    if(i>=80) {
        println("pass")
    } else{
        println("${80-i} more score")
    }
}