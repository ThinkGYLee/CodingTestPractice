data class Student(val height: Int, val weight: Int, val number: Int)

fun main() {
    val n = readLine()!!.toInt()
    val students = mutableListOf<Student>()
    repeat(n) { i ->
        val (height, weight) = readln().split(" ").map { it.toInt() }
        students.add(Student(height, weight, i + 1))
    }
    // Please write your code here.
    val sorted = students.sortedWith(
        compareByDescending<Student>{ it.height }
            .thenByDescending{ it.weight }
            .thenBy{ it.number }
    )
    sorted.forEach{
        println("${it.height} ${it.weight} ${it.number}")
    }
}