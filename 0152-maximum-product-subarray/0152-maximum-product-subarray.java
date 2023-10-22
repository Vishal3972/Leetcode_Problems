class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int ans = 1;
        int Max_Prod = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0; i<nums.length; i++){
            if(prod == 0){ 
                prod = 1;
            }
            if(ans == 0){
                ans = 1;
            }

            prod = prod*nums[i];
            ans= ans*nums[n-i-1];

            Max_Prod = Math.max( Max_Prod , Math.max(prod,ans));
        }
        return Max_Prod;
    }
}