fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val penalizedPersons = List(m) { readln().toInt() }
    // Please write your code here.
    //n명 학생 (1~n번)
    //학생이 k번이상 벌칙 받으면 벌금
    //m번에 걸쳐서 학생번호가 순서대로 주어짐
    val penalty = mutableListOf<Int>()
    var number = -1
    for(i in 0..n-1) {
        penalty.add(0)
    }
    for(i in 0..m-1) {
        penalty[penalizedPersons[i]-1]++
        if(penalty[penalizedPersons[i]-1] == k) {
            number = penalizedPersons[i]
            break
        }
    }
    println(number)
}