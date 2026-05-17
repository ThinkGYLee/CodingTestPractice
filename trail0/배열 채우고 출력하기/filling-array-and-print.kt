fun main() {
    val strings = readln().split(" ")
    for(i in strings.size-1 downTo 0) {
        print("${strings[i]}")
    }
}