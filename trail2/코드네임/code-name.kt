fun main() {
    val users = mutableListOf<Pair<Char, Int>>()
    repeat(5) {
        val (code, scoreStr) = readln().split(" ")
        users.add(code[0] to scoreStr.toInt())
    }
    // Please write your code here.
    val list = listOf(
        User(users[0].first, users[0].second),
     User(users[1].first, users[1].second),
     User(users[2].first, users[2].second),
     User(users[3].first, users[3].second),
    User(users[4].first, users[4].second),
    )
    val find = list.sortedBy{ it.score }.first()
    println("${find.code} ${find.score}")
     
}

data class User(
    var code: Char,
    var score: Int
)