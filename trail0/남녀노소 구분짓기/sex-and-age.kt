fun main() {
    val sex = readln().toInt()
    val age = readln().toInt()

    if(sex == 0) {
        if(age > 18) {
            println("MAN")
        } else {
            println("BOY")
        }
    } else {
        if(age > 18) {
            println("WOMAN")
        } else {
            println("GIRL")
        }
    }
}