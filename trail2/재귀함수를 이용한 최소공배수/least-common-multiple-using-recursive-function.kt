fun main() {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.
    // 인덱스 0부터 시작하여 리스트 전체의 최소공배수를 계산합니다.
    val result = getLcmOfList(numbers, 0)
    
    // 최종 결과를 출력합니다.
    println(result)
}

// 유클리드 호제법을 이용하여 두 수의 최대공약수를 구하는 재귀 함수
fun gcd(a: Int, b: Int): Int {
    // 나머지가 0이 되면 나누는 수를 반환합니다.
    if (b == 0) {
        return a
    }
    // b와 a를 b로 나눈 나머지를 사용하여 재귀 호출합니다.
    return gcd(b, a % b)
}

// 두 수의 최소공배수를 구하는 함수
fun lcm(a: Int, b: Int): Int {
    // 두 수의 곱을 최대공약수로 나누어 반환합니다.
    return (a * b) / gcd(a, b)
}

// 리스트 내 모든 수의 최소공배수를 재귀적으로 구하는 함수
fun getLcmOfList(arr: List<Int>, index: Int): Int {
    // 리스트의 마지막 원소에 도달한 경우 해당 원소를 반환합니다.
    if (index == arr.size - 1) {
        return arr[index]
    }
    // 현재 인덱스의 원소와 다음 인덱스부터의 최소공배수를 재귀적으로 계산하여 반환합니다.
    return lcm(arr[index], getLcmOfList(arr, index + 1))
}