fun main() {
    val n = readLine()!!.toInt()
    val students = mutableListOf<Triple<String, Int, Int>>()
    repeat(n) {
        val (name, heightStr, weightStr) = readln().split(" ")
        val height = heightStr.toInt()
        val weight = weightStr.toInt()
        students.add(Triple(name, height, weight))
    }
    // Please write your code here.
    val personList = students.map{
        Person(
            name = it.first,
            height = it.second,
            weight = it.third
        )
    }
    val sortedList = personList.sortedBy{ it.height }
    sortedList.forEach{
        println("${it.name} ${it.height} ${it.weight}")
    }
}

data class Person(
    val name: String,
    val height: Int,
    val weight: Int
)