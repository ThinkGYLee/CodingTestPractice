fun main() {
    val caseCount = readLine()!!.toInt()
    for (j in 1..caseCount) {
        val input = readLine()!!.split(" ")
        val repeat = input[0].toInt()
        val str = input[1]
        val length = str.length
        for (i in 0..length - 1) {
            for (k in 1..repeat) {
                print(str[i])
            }
        }
        println()
    }
}