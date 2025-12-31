package arrays

/*
    Single Element
        finding element that appears once in an array

     using xor.
            1 xor 1 = 0
            1 xor 0 = 1
 */

class SingleElement {
    fun findSingleElement(numArr: IntArray): Int {
        var singleElement = 0
        for (num in numArr) {
            singleElement = singleElement xor num
        }
        return singleElement
    }
}

fun main() {
    val singleElement = SingleElement()
    val numArr = intArrayOf(1,2,2,3,3,5,5)
    val result = singleElement.findSingleElement(numArr = numArr)
    println("Single element: $result")
}