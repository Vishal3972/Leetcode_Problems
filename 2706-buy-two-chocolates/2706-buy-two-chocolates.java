class Solution {
    public int buyChoco(int[] prices, int money) {
        // Arrays.sort(prices);
        // int i=1;
        // while(i<prices.length && prices[i]<=money){
        //     int sum=prices[i-1]+prices[i];
        //     if(sum<=money){
        //         return money-sum;
        //     }
        //     i++;
        // }
        // return money;
        
        int small=201;
        int secondsmall=201;
        for(int i:prices){
            if(i<small){
                secondsmall=small;
                small=i;
            }else if(i<secondsmall){
                secondsmall=i;
            }
        }
        int sum=small+secondsmall;
        return (sum<=money)?money-sum:money;
    }
}