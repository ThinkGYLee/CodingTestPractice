fun main() {
    val a: Double = readLine()!!.toDouble()
    val b: Double = readLine()!!.toDouble()
    val c: Double = readLine()!!.toDouble()
    val stringa = String.format("%.3f", a)
    val stringb = String.format("%.3f", b)
    val stringc = String.format("%.3f", c)
    println(stringa)
    println(stringb)
    println(stringc)
}