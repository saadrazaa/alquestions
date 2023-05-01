package code.problems.windows;

import java.util.List;

/*
Problem:
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104
 */
public class BestTimeToBuyAndSellStock {

    public static int find(List<Integer> prices){
        int maxProfit = 0;

        int left = 0;
        int right = 1;

        while (right < prices.size()){

            if (prices.get(left) < prices.get(right)){
                maxProfit = Math.max(prices.get(right) - prices.get(left), maxProfit);
            }
            else{
                left = right;
            }

            right += 1;
        }

        return maxProfit;
    }
}
