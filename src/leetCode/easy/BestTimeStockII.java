package leetCode.easy;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//greedy algorithm, 문제를 이해 못해서 한참 헤맴..(sample case도 없고...)
public class BestTimeStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null || prices.length <= 1) return maxProfit;
        int i = 1;
        while (i < prices.length) {
            if (prices[i -1] < prices[i]) {
               maxProfit += prices[i] - prices[i-1];
            }
            i++;
        }

        return maxProfit;
    }
}
