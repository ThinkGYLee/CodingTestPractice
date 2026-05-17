import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val water = sc.nextInt()
    if(water<0) {
        println("ice")        
    } else if(water>=100) {
        println("vapor")        
    } else {
        println("water")        
    }
}