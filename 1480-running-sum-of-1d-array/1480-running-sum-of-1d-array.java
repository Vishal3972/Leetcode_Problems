class Solution {
    public int[] runningSum(int[] nums) {
        int output[] = new int[nums.length];
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans + nums[i];
            output[i] = ans;
        }
        return output;
    }
}