class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int ans = nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                ans = ans+nums[i+1];
            }else{
                if(max < ans){
                    max = ans;
                }
                ans = nums[i+1];
            }
        }
        return (max>ans)?max:ans;
    }
}