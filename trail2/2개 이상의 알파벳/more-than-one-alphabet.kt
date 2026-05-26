fun main() {
    val a: String = readLine()!!
    
    // Please write your code here.
    var set = mutableSetOf<String>()
    val result = inputAlphabet(set, a)
    if(result.size>1) {
        println("Yes")
    } else {
        println("No")
    }
}
fun inputAlphabet(set: MutableSet<String>, strings: String): Set<String> {
    var returnSet = set
    strings.forEach {
        set.add(it.toString())
    }
    return returnSet
}