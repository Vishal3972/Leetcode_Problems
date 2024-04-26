class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int cur = 0;
        int prev = 0;
        int max = 0;
        boolean isZero = false; 

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cur++;
            } else{
                max=Math.max(max, cur+prev);
                prev = cur;
                cur=0;
            }
        }
        max = Math.max(max, cur+prev);
        return max==n?n-1:max;
    }
}
