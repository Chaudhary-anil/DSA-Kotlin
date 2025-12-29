package arrays

class BestTimeToBuySellStock {
    fun maxProfit(prices: IntArray): Int {
        var minBuyPrice = Int.MAX_VALUE
        var maxProfit = 0
        for (price in prices) {
            if (price < minBuyPrice) {
                minBuyPrice = price
            }
            else {
                val profit = price - minBuyPrice
                if (maxProfit < profit) {
                    maxProfit = profit
                }
            }
        }
        return maxProfit
    }
}

fun main() {
    val bestTimeToBuySellStock = BestTimeToBuySellStock()
    val prices = intArrayOf(2,4,8,10,1,3)
    val result = bestTimeToBuySellStock.maxProfit(prices = prices)
    println(result)
}
