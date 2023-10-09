class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i:nums){
            if(sum<0){
                sum=0;
            }
            sum+=i;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}