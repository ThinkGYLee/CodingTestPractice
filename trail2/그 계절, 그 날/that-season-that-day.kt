fun main() {
    val (y, m, d) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    val isYun = isYun(y)
    if(isExists(isYun, m, d)) {
          if(m>=3 && m<=5) {
               println("Spring")
          } else if(m>=6 && m<=8) {
               println("Summer")
          } else if(m>=9 && m<=11) {
               println("Fall")
          } else {
               println("Winter")
          }
    } else {
          println("-1")
    }
}

/*

*/
fun isYun(y: Int): Boolean {
     val is400Bae = is400Bae(y)
     val is100Bae = is100Bae(y)
     val is4Bae = is4Bae(y)
     return if(is400Bae && is100Bae && is4Bae) {
          true
     } else if(!is400Bae && is100Bae && is4Bae) {
          false 
     } else if(!is400Bae && !is100Bae && is4Bae) {
          true
     } else {
          false
     }
}

fun is4Bae(y: Int): Boolean {
     return y%4 == 0
}

fun is100Bae(y: Int): Boolean{
     return y%100 == 0
}

fun is400Bae(y: Int): Boolean {
     return y%400 == 0
}

fun isExists(isYun: Boolean, y: Int, m: Int, d: Int) {

}

fun isExists(isYun: Boolean, m: Int, d: Int): Boolean {
    return when(m) {
        1 -> {
           if(d<32) {
                true
           } else {
                false
           } 
        }
        2 -> {
          if(isYun) {
               if(d<30) {
                true
           } else {
                false
           }
          } else {
               if(d<29) {
                true
           } else {
                false
           }
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