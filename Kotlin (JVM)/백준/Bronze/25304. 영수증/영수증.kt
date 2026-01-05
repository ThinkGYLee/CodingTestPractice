fun main() {
    val totalMoney = readLine()!!
    val totalAmount = readLine()!!
    var i = totalAmount.toLong()
    var calculatedMoney = 0L
    while(i>0) {
        val a = readLine()!!
        val pars = a.split(" ")
        val b = pars[0].toLong()
        val c = pars[1].toLong()
        calculatedMoney += (b*c)
        i--
    }
    if(calculatedMoney == totalMoney.toLong()) {
        println("Yes")
    } else {
        println("No") 
    }
}