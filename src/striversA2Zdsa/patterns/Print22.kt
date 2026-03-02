package striversA2Zdsa.patterns

class Print22 {
    fun print22(n: Int) {

        val size = 2*n - 1

        for (i in 1..size) {
            for (j in 1..size) {
                val top = i - 1
                val left = j - 1
                val bottom = size - i
                val right = size - j

                val minValue = minOf(top,left,bottom,right)

                print(n - minValue)
            }
            println()
        }







        //manual
//        for (i in 1..<2*n) {
//             for (j in 1..<2*n) {
//                 if (i==1 || j==1 || i==2*n-1 || j==2*n-1) {
//                     print(n)
//                 }
//                 else if (i == 2 || j == 2 || j == 2*n-2 || i == 2*n-2) {
//                     print(n-1)
//                 }
//                 else if(i==3 || j == 3 || j == 2*n-3 || i == 2*n-3) {
//                     print(n-2)
//                 }
//                 else if(i==4 || j == 4 || j == 2*n-4 || i == 2*n-4) {
//                     print(n-3)
//                 }
//                 else {
//                     print(" ")
//                 }
//             }
//            println()
//        }
    }
}

fun main() {
    val print22 = Print22()
    print22.print22(5)
}