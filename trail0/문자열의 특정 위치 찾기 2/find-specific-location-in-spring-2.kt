fun main() {
    val strings = listOf("apple", "banana","grape", "blueberry", "orange")
    val find = readln()
    val filteredStrings = mutableListOf<String>()
    strings.forEach{
        if(it[2].toString() == find || it[3].toString() == find) {
            println(it)
            filteredStrings.add(it)
        }
    }
    println(filteredStrings.size)
}