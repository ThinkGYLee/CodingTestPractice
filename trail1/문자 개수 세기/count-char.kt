fun main() {
    val strings = readln()
    val char = readln().first()
    var count = 0
    strings.forEach{ it ->
        if(it == char) count++
    }
    print(count)
}