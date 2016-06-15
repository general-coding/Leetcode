package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 *         Say you have an array for which the ith element is the price of a
 *         given stock on day i.
 * 
 *         If you were only permitted to complete at most one transaction (ie,
 *         buy one and sell one share of the stock), design an algorithm to find
 *         the maximum profit.
 *
 */

public class E121_BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}

		int min = prices[0];
		int max = prices[1] - min;

		for (int i = 2; i < prices.length; i++) {
			if (min > prices[i - 1]) {
				min = prices[i - 1];
			}

			if (max < prices[i] - min) {
				max = prices[i] - min;
			}
		}

		if (max < 0) {
			return 0;
		} else {
			return max;
		}
	}

	public static void main(String[] args) {
		System.out.println(new E121_BestTimeToBuyAndSellStock().maxProfit(new int[] { 1, 2, 3 }));
	}

}
