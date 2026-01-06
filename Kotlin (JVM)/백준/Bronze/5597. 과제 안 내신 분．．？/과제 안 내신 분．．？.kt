fun main() {
    var i = 28
    val hash = HashSet<Int>()
    while(i>0) {
        val pars = readLine()!!
        hash.add(pars.toInt())
        i--
    }
    i = 1
    while(i<31) {
        if(!hash.contains(i)) println(i)
        i++
    }
}