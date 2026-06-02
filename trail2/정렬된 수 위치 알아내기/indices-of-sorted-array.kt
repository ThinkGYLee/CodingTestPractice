fun main() {
    val n = readLine()!!.trim().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    val mapped = numbers.mapIndexed{ index, value ->
        A(
            value = value,
            index = index+1
        )
    }
    val result = mapped.sortedWith(
        compareBy<A>{ it.value }
            .thenBy{ it.index }
    )
    val current = result.mapIndexed{ index,it ->
        B(
            value = it.value,
            index = it.index,
            current = index+1
        )
    }
    current.sortedBy{ it.index }.forEach{
        print("${it.current} ")
    }
}
data class A(
    val value: Int,
    val index: Int
)

data class B(
    val value: Int,
    val index: Int,
    val current: Int
)