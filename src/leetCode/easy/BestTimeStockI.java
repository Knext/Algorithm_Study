package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//DP 흉내내다가 속도 엄청 까먹음...
public class BestTimeStockI {
    public int maxProfit(int[] prices) {
       return fastSolution(prices);
    }

    private int fastSolution(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i< prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else if (prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }

        return maxProfit;
    }

    private int slowSolution(int[] prices){
        if (prices == null || prices.length <= 1) return 0;

        int[] profitTable = new int[prices.length];
        Arrays.fill(profitTable, 0);

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                profitTable[j] = Math.max(prices[j] - prices[i], profitTable[j]);
            }
        }

        int maxProfit = 0;
        for (int i = 0; i < profitTable.length; i++) {
            maxProfit = Math.max(profitTable[i], maxProfit);
        }
        return maxProfit;
    }
}
