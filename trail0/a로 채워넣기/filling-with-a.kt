fun main() {
    var string = readln()
    val size = string.length
    // 1번 인덱스의 문자를 "a"로 변경합니다.
    val firstChange = string.replaceRange(1, 2, "a")
    
    // 끝에서 두 번째(size - 2) 인덱스의 문자를 "a"로 변경합니다.
    val secondChange = firstChange.replaceRange(size - 2, size - 1, "a")
    println(secondChange)
}