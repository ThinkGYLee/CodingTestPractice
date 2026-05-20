fun main() {
    val list = mutableListOf<String>()
    var char = 'a'
    for(i in 0..10) {
        if(i<10) {
            list.add(readln())
        } else {
            char = readln().first()
        }
    }
    val filteredList = list.filter{ it.last() == char }
    if(filteredList.isNotEmpty()){
        filteredList.forEach {
        println(it)
    }
    } else {
        println("None")
    }

}