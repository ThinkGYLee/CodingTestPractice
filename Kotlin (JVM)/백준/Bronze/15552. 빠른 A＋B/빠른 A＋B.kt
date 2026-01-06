import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringBuilder()
    
    val n = br.readLine().toInt()
    
    repeat(n) {
        val line = br.readLine()
        val tokenizer = StringTokenizer(line)
        val a = tokenizer.nextToken().toInt()
        val b = tokenizer.nextToken().toInt()
        
        st.append(a + b).append('\n')
    }
    
    print(st)
}