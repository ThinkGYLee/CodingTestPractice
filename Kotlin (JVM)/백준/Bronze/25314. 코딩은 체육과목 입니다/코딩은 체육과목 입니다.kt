fun main() {
    val a = readLine()!!.toLong()
    var t = a/4
    val k = a%4
    if(k>0) {
        t = t+1
    }
    while(t>0) {
        print("long ")
        t--
    }
    print("int") 
}