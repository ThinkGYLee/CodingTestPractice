fun main() {
    val split = readLine()!!.split(" ")
    println(split.filterNot { it.isBlank() }.count())
}