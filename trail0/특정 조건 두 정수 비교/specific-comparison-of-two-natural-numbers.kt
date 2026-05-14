import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val strings = sc.nextLine().split(" ").map{it.toInt()}
    val a = strings[0]
    val b = strings[1]
    if(a<b) {
        print("1 ")
    } else {
        print("0 ")
    }
    if(a==b) {
        print("1")
    } else {
        print("0")
    }

}