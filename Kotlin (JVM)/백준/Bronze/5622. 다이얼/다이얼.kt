fun main() {
    val word = readLine()!!
    val totalTime = word.map { char ->
        when (char) {
            in "ABC" -> 3
            in "DEF" -> 4
            in "GHI" -> 5
            in "JKL" -> 6
            in "MNO" -> 7
            in "PQRS" -> 8
            in "TUV" -> 9
            in "WXYZ" -> 10
            else -> 0
        }
    }.sum()

    println(totalTime)
}