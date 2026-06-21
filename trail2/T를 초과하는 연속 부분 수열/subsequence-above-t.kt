fun main() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.

    // 현재 t보다 큰 숫자가 연속으로 나온 길이를 저장할 변수
    var currentLength = 0

    // 조건에 맞는 연속 부분 수열의 최대 길이를 저장할 변수
    var maxLength = 0

    // 수열의 처음부터 끝까지 순회하며 확인
    for (num in numbers) {
        // 현재 숫자가 t보다 큰 경우
        if (num > t) {
            // 연속된 길이를 1 증가시킴
            currentLength++
            
            // 여태까지 나온 최대 길이와 현재 길이를 비교하여 최댓값 갱신
            if (currentLength > maxLength) {
                maxLength = currentLength
            }
        } else {
            // t 이하의 숫자를 만나면 연속성이 깨지므로 길이를 0으로 초기화
            currentLength = 0
        }
    }

    // 최종적으로 구한 최대 연속 부분 수열의 길이를 출력
    println(maxLength)
}