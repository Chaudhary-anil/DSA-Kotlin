package arrays

/*
Problem:
Given an array of integers and a target, return indices of
two numbers such that they add up to target.

Approach:
Use a map to store number → index, then check if complement exists.

*/

class TwoSum {
    fun twoSum(num: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>() //used mutableMapOf() which uses HashMap internally
        for (i in num.indices) {
            val need = target - num[i]
            if (map.containsKey(need)) {
                return intArrayOf(map[need]!!, i)
            }
            map[num[i]] = i
        }
        return intArrayOf()
    }
}

fun main() {
    val ts = TwoSum()
    val result = ts.twoSum(num = intArrayOf(2,8,7,9,11) , 9)
    println(result.contentToString())
}