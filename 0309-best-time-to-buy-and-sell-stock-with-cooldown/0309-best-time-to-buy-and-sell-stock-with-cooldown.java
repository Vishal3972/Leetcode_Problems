class Solution {
    Integer [][]arr;
    public int maxProfit(int[] prices) {
        arr = new Integer[prices.length][3];
        return getmaxstock(prices, 0, 0);
    }
    public int getmaxstock(int[] prices, int i, int transactions){
        if(i>=prices.length){
            return 0;
        }
        if(arr[i][transactions]!=null){
            return arr[i][transactions];
        }
        int t1 = getmaxstock(prices, i+1, transactions);
        if(transactions==0 || transactions==1){
            int t2 = -prices[i]+getmaxstock(prices, i+1, 2);
            return arr[i][transactions]=Math.max(t1,t2);
        }else{
            int t3 = prices[i]+getmaxstock(prices, i+2, 1);
            return arr[i][transactions]=Math.max(t1, t3);
        }
        
    }
}