fun main() {
    val tokens = readln().split(" ")
    val a = tokens[0].toInt()
    val op = tokens[1].single()
    val c = tokens[2].toInt()
    
    // Please write your code here.
    when(op) {
        '+' -> {
            add(a,c)
        }
        '-' -> {
            minus(a,c)
        }
        '*' -> {
            multiply(a,c)
        }
        '/' -> {
            divide(a,c)
        }
        else -> {
            println("False")
        }
    }
}

fun add(a: Int, c: Int){
    println("$a + $c = ${a+c}")
}

fun minus(a: Int, c: Int){
    println("$a - $c = ${a-c}")
}

fun multiply(a: Int, c: Int){
    println("$a * $c = ${a*c}")
}

fun divide(a: Int, c: Int){
    println("$a / $c = ${a/c}")
}