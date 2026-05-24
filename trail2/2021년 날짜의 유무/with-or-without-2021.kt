fun main() {
    val (m, d) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    if(judge(m,d)) {
        println("Yes")
    } else {
        println("No")
    }
}

fun judge(m: Int, d: Int): Boolean {
    return when(m) {
        1 -> {
           if(d<32) {
                true
           } else {
                false
           } 
        }
        2 -> {
            if(d<29) {
                true
           } else {
                false
           } 
        }
        3 -> {
            if(d<32) {
                true
           } else {
                false
           } 
        }
        4 -> {
            if(d<31) {
                true
           } else {
                false
           }
        }
        5 -> {
            if(d<32) {
                true
           } else {
                false
           } 
        }
        6 -> {
            if(d<31) {
                true
           } else {
                false
           }
        }
        7 -> {
            if(d<32) {
                true
           } else {
                false
           } 
        }
        8 -> {
            if(d<32) {
                true
           } else {
                false
           } 
        }
        9 -> {
            if(d<31) {
                true
           } else {
                false
           }
        }
        10 -> {
            if(d<32) {
                true
           } else {
                false
           } 
        }
        11 -> {
            if(d<31) {
                true
           } else {
                false
           }
        }
        12 -> {
            if(d<32) {
                true
           } else {
                false
           } 
        }
        else -> { false }
    }
}
