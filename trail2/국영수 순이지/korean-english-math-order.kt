fun main() {
    val n = readLine()!!.toInt()
    val students = mutableListOf<Student>()
    repeat(n) {
        val input = readln().split(" ")
        val name = input[0]
        val korean = input[1].toInt()
        val english = input[2].toInt()
        val math = input[3].toInt()
        students.add(Student(name, korean, english, math))
    }
    // Please write your code here.
    val sortedList = students.sortedWith(
        compareByDescending<Student> { it.korean }
            .thenByDescending { it.english }
            .thenByDescending { it.math }
            .thenBy { it.name }
    )

    sortedList.forEach{
        println("${it.name} ${it.korean} ${it.english} ${it.math}")
    }
}

data class Student(val name: String, val korean: Int, val english: Int, val math: Int)