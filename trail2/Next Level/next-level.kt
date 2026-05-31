fun main() {
    val (id2, level2String) = readln().split(" ")
    val level2 = level2String.toInt()
    
    // Please write your code here.
    val user1 = User("codetree", 10)
    val user2 = User(id2, level2)
    println("user ${user1.id} lv ${user1.level}")
    println("user ${user2.id} lv ${user2.level}")
}

data class User(
    val id: String,
    val level: Int
)