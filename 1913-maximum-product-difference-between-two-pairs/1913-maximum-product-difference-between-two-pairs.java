class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans1=nums[0]*nums[1];
        int ans2=nums[n-1]*nums[n-2];
        return ans2-ans1;
    }
}