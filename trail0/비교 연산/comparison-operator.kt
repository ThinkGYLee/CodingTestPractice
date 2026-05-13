import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val strings = sc.nextLine().split(" ").map{ it.toInt() }
    val a = strings[0]
    val b = strings[1]
    if(a>=b) {
        println(1)
    } else {
        println(0)
    }
    if(a>b) {
        println(1)
    } else {
        println(0)
    }
    if(a<=b) {
        println(1)
    } else {
        println(0)
    }
    if(a<b) {
        println(1)
    } else {
        println(0)
    }
    if(a==b) {
        println(1)
    } else {
        println(0)
    }
    if(a!=b) {
        println(1)
    } else {
        println(0)
    }
}