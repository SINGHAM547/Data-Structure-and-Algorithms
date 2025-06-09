class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i=1 ;i<prices.length;i++){
            if(minprice>prices[i]){
                minprice = prices[i]; 
            }else{
                int currprofit = prices[i]-minprice;
                maxprofit = Math.max(currprofit,maxprofit);
            }
        }
        return maxprofit;
    }
}