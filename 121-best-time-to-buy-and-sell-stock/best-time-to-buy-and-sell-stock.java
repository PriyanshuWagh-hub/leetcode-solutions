class Solution {
    public int maxProfit(int[] prices) {
        int minsell = prices[0];
        int maxprofit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minsell){
                minsell = prices[i];
            }
            int profit = prices[i] - minsell;

            if (profit > maxprofit) {
                maxprofit = profit;
            }
        }
       return maxprofit; 
    }
    
}