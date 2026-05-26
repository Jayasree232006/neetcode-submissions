class Solution {
    public int maxProfit(int[] prices) {
       int buy=0,sell=0;
       int currprofit=0,maxprofit=0;
       for(int i=0;i<prices.length;i++ ){
        buy=prices[i];
        for(int j=i+1;j<prices.length;j++){
            if(prices[j]>buy){
                sell=prices[j];
                currprofit=sell-buy;
                if(currprofit>maxprofit){
                    maxprofit=currprofit;
                }
            }
        }
       } 
       return maxprofit;
    }
}
