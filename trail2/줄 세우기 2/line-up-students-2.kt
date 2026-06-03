fun main() {
    val n = readLine()!!.toInt()
    val students = mutableListOf<Triple<Int, Int, Int>>()
    repeat(n) { i ->
        val (height, weight) = readln().split(" ").map { it.toInt() }
        students.add(Triple(height, weight, i + 1))
    }
    // Please write your code here.
    val mapped = students.map { Student(it.first, it.second, it.third) }
    val sorted = mapped.sortedWith(
        compareBy<Student>{ it.height }
            .thenByDescending{ it.weight }
    )
    sorted.forEach{
        println("${it.height} ${it.weight} ${it.number}")
    }
}
data class Student(
    val height: Int,
    val weight: Int,
    val number: Int
)