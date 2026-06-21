fun main() {
    val n = readLine()!!.toInt()
    val arr = MutableList(n) { readLine()!!.toInt() }
    // Please write your code here.
    
    // 수열의 길이가 0이거나 1인 경우 예외 처리
    if (n <= 1) {
        println(n)
        return
    }

    // 현재까지의 연속 부분 수열의 길이를 저장할 변수
    var currentLength = 1
    
    // 전체 수열 중 가장 긴 연속 부분 수열의 길이를 저장할 변수
    var maxLength = 1

    // 두 번째 원소(인덱스 1)부터 시작하여 직전 원소와 비교
    for (i in 1 until n) {
        // 현재 원소가 직전 원소보다 큰 경우 (연속 증가 조건)
        // 만약 문제 조건이 '크거나 같은(비내림차순)' 이라면 arr[i] >= arr[i - 1]로 변경해주세요.
        if (arr[i] > arr[i - 1]) {
            // 연속된 수열의 길이를 1 증가시킴
            currentLength++
        } else {
            // 연속성이 깨진 경우 길이를 다시 1로 초기화
            currentLength = 1
        }

        // 여태까지 나온 최대 길이와 현재 길이를 비교하여 최댓값 갱신
        if (currentLength > maxLength) {
            maxLength = currentLength
        }
    }

    // 최종 최대 연속 부분 수열의 길이 출력
    println(maxLength)
}