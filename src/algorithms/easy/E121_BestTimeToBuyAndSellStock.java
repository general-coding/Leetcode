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
	        int maxProfit = 0;
	
	        int entryPrice = int.MaxValue;
	
	        foreach (int p in prices)
	        {
	            if (p < entryPrice)
	            {
	                entryPrice = p;
	            }
	            maxProfit = Math.Max(maxProfit, p - entryPrice);
	        }
	
	        return maxProfit;
	}

	public static void main(String[] args) {
		System.out.println(new E121_BestTimeToBuyAndSellStock().maxProfit(new int[] { 1, 2, 3 }));
	}

}
