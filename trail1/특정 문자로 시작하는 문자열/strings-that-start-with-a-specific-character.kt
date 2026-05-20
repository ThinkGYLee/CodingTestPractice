fun main(){
    val n = readln()!!.toInt()
    val list = mutableListOf<String>()
    var char = 'a'
    for(i in 0..n) {
        if(i<n) {
            list.add(readln())
        } else {
            char = readln().first()
        }
    }
    val filteredList = list.filter { it.first() == char }
    print(filteredList.size)
    var sum = 0
    for(i in 0..filteredList.size-1) {
        sum = sum + filteredList[i].length
    }
    val avg = sum.toFloat() / filteredList.size.toFloat()
    print(" ${String.format("%.2f", avg)}")
}