fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val aMoves = mutableListOf<Pair<Char, Int>>()
    repeat(n) {
        val (d, t) = readln().split(" ")
        aMoves.add(Pair(d.first(), t.toInt()))
    }
    val bMoves = mutableListOf<Pair<Char, Int>>()
    repeat(m) {
        val (d, t) = readln().split(" ")
        bMoves.add(Pair(d.first(), t.toInt()))
    }
    // Please write your code here.
    val posA = mutableListOf<Int>()
    val posB = mutableListOf<Int>()
    posA.add(0)
    posB.add(0)

    var currentA = 0
    for (move in aMoves) {
        val dir = move.first
        val time = move.second
        
        repeat(time) {
            if (dir == 'L') {
                currentA--
            } else {
                currentA++
            }
            posA.add(currentA)
        }
    }

    var currentB = 0
    for (move in bMoves) {
        val dir = move.first
        val time = move.second
        
        // 지정된 시간(초)만큼 1칸씩 이동하며 기록합니다.
        repeat(time) {
            if (dir == 'L') {
                currentB--
            } else {
                currentB++
            }
            posB.add(currentB)
        }
    }

    var answer = -1
    
    for (i in 1 until posA.size) {
        if (posA[i] == posB[i]) {
            answer = i
            break
        }
    }
    println(answer)
}