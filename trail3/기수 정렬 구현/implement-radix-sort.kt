fun main() {
    val n = readLine()!!.toInt()
    val arr = readln().split(" ").map { it.toInt() }
    // Please write your code here.

    var sortedArr = arr

    // 가장 큰 숫자의 자릿수를 구한다.
    val k = arr.maxOf { it.toString().length }

    // 가장 오른쪽 자릿수부터 가장 왼쪽 자릿수까지 반복한다.
    for (pos in k - 1 downTo 0) {

        // 0~9까지 각 숫자별 바구니를 만든다.
        val arrNew = Array(10) { mutableListOf<Int>() }

        // 현재 배열의 숫자들을 하나씩 확인한다.
        for (i in 0 until n) {

            // 숫자의 자릿수를 맞추기 위해 앞에 0을 붙인다.
            val str = sortedArr[i].toString().padStart(k, '0')

            // 현재 pos 위치의 숫자를 구한다.
            val digit = str[pos] - '0'

            // 해당 숫자 바구니에 값을 넣는다.
            arrNew[digit].add(sortedArr[i])
        }

        // 바구니에 담긴 숫자들을 다시 합칠 배열이다.
        val storeArr = mutableListOf<Int>()

        // 0번 바구니부터 9번 바구니까지 순서대로 꺼낸다.
        for (i in 0 until 10) {
            for (j in 0 until arrNew[i].size) {
                storeArr.add(arrNew[i][j])
            }
        }

        // 이번 자릿수 기준으로 정렬된 결과를 sortedArr에 저장한다.
        sortedArr = storeArr
    }

    // 최종 정렬 결과를 출력한다.
    println(sortedArr.joinToString(" "))
}

/*
function radix_sort(arr, k)
  for pos = k - 1 ... pos >= 0:
    set arr_new = [10][]
    for i = 0 ... i < arr.size
      set digit = posth digit of arr[i]
      arr_new[digit].append(arr[i])

    set store_arr = []
    for i = 0 ... i < 10
      for j = 0 ... j < arr_new[i].size
        store_arr.append(arr_new[i][j])
  
    arr = store_arr

  return arr
*/