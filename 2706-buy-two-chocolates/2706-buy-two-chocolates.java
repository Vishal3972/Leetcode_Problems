class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int i=1;
        while(i<prices.length && prices[i]<=money){
            int sum=prices[i-1]+prices[i];
            if(sum<=money){
                return money-sum;
            }
            i++;
        }
        return money;
    }
}