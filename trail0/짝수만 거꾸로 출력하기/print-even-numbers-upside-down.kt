fun main() {
    val n = readln().toInt()
    val ints = readln().split(" ").map{ it.toInt() }.reversed()
    ints.forEach{
        if(it%2 ==0) {
            print("$it ")
        }
    }
}