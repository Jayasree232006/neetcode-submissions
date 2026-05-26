class Solution {
    public int maxProfit(int[] prices) {
      int left=0,right=1;
      int currprofit=0;
      int maxprofit=0;
      while(right<prices.length){
        if(prices[left]<prices[right]){
currprofit=prices[right]-prices[left];
if(currprofit>maxprofit){
    maxprofit=currprofit;
}
        }
        else{
            left=right;
        }
        right++;
      }
      return maxprofit;
    }
}
