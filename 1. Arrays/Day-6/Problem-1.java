/**
 * @author AkashGoyal
 * @date 29/05/2021
 */

/**


--------------------- Problem----------->> Best Time to Buy and Sell Stock

    Problem Link :- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

  */


  class Solution {
    public int maxProfit(int[] prices) {
        
        
        int max=prices[prices.length-1];
        int profit=0;
        
        for(int i=prices.length-2;i>=0;i--)
        {
            if(max-prices[i]>profit)
            {
                profit=max-prices[i];
            }
            if(max<prices[i])
            {
                max=prices[i];
            }
            
        }
        
        return profit;
        
    }
}