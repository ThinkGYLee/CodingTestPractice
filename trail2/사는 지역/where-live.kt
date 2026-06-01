fun main() {
    val n = readLine()!!.toInt()
    val people = mutableListOf<Triple<String, String, String>>()
    repeat(n) {
        val (name, address, city) = readln().split(" ")
        people.add(Triple(name, address, city))
    }
    // Please write your code here.
    val selectedPerson = people.sortedBy{ it.first }.last()
    val person = Person(
        selectedPerson.first,
        selectedPerson.second,
        selectedPerson.third
    )
    println("name ${person.name}")
    println("addr ${person.address}")
    println("city ${person.distinct}")
}

data class Person(
    val name: String,
    val address: String,
    val distinct: String
)