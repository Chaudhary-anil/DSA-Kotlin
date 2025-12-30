package arrays

class MajorityElement {
    fun findMajorityElement(numArr: IntArray): Int {
        var count = 0
        var candidate = 0
        for (num in numArr) {
            if (count == 0) {
                candidate = num
            }
            count += if (candidate == num) 1 else -1
        }
        return candidate
    }
}

fun main() {
    val majorityElement = MajorityElement()
    val numArray = intArrayOf(1,2,1,1,2,2,2)
    val result = majorityElement.findMajorityElement(numArr = numArray)
    println(result)
}