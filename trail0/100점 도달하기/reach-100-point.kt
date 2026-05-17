fun main() {
    val score = readln().toInt()
    for(i in score..100) {
        if(i<60) {
            print("F ")
        } else if(i>=90) {
            print("A ")
        } else if(i>=80) {
            print("B ")
        } else if(i>=70) {
            print("C ")
        } else if(i>=60) {
            print("D ")
        }
    }
}