fun main() {
    val n = readLine()!!.toInt()
    val students = mutableListOf<Student>()
    repeat(n) {
        val (name, korean, english, math) = readln().split(" ")
        students.add(Student(name, korean.toInt(), english.toInt(), math.toInt()))
    }
    // Please write your code here.
    val sortedList = students.sortedWith(
        compareBy{ it.korean + it.english + it.math }
    )
    sortedList.forEach{
        println("${it.name} ${it.korean} ${it.english} ${it.math}")
    }
}

data class Student(val name: String, val korean: Int, val english: Int, val math: Int)