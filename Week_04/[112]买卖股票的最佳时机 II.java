/**
 * greedy :第二天的价格大于前一天的价格，就赚取利润
 */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit +=  prices[i] -  prices[i-1];
            }
        }
        return profit;
    }
}
