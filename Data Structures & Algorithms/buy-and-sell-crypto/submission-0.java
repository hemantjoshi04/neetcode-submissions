class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minPrice=prices[0];
        int left=0;
        for(int right=0;right<prices.length;right++){
            profit=Math.max(profit,prices[right]-minPrice);
            minPrice=Math.min(prices[right],minPrice);
        }
        return profit;
        
    }
}