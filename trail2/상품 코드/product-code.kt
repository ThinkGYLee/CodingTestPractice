fun main() {
    val input = readLine()!!.split(" ")
    val productName = input[0]
    val productCode = input[1].toInt()
    
    // Please write your code here.
    val p1 = P("codetree", 50)
    val p2 = P(productName, productCode)
    println("product ${p1.code} is ${p1.name}")
    println("product ${p2.code} is ${p2.name}")
}
data class P(
    val name: String,
    val code: Int
)