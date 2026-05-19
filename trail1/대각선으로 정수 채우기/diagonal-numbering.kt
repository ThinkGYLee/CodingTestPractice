/*
00
01 -> 10
02 -> 11 -> 20
03 -> 12 -> 21 -> 30
04 -> 13 -> 22 -> 31
05 -> 14 -> 23 -> 32 
15 -> 24 -> 33 
25 -> 34
35
max 행 n-1 max 열 m-1
최대 횟수 = n+m-1
m-1 까진 j 가 늘어남
m-1 에서 m+n-1 까지는 j는 그대로 i 가 늘어남
currentStart 좌표를 설정하고 루프가 돌때마다 커서를 움직임. 
커서가 벗어나면 다음거로
*/

fun main() {
    val nm = readln().split(" ").map{ it.toInt() }
    val n = nm[0]
    val m = nm[1]
    val array = Array(n){IntArray(m){0}}
    var currentMaxRow = 0
    var currentMaxColumn = 0
    var currentInput = 1
    for(i in 0..(n+m-1)){
        var currentRow = currentMaxRow
        var currentColumn = currentMaxColumn
        while(currentRow<n && currentColumn <m && currentRow >=0 && currentColumn>=0) {
            array[currentRow][currentColumn] = currentInput
            currentInput++
            currentRow++
            currentColumn--
        }
        if(currentMaxColumn+1 < m) {
            currentMaxColumn++
        } else if(currentMaxRow < n) {
            currentMaxRow++
        }
    }
    for(i in 0..n-1) {
        for (j in 0..m-1) {
            print("${array[i][j]} ")
        }
        println("")
    }
}