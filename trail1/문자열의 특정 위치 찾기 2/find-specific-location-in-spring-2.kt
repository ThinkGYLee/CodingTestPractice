fun main() {
    val list = listOf(
        "apple",
        "banana",
        "grape",
        "blueberry",
        "orange"
    )
    val a = readln().first()
    val filteredList = list.filter{
        it[2] == a || it[3] == a
    }
    filteredList.forEach{
        println(it)
    }
    println(filteredList.size)
}