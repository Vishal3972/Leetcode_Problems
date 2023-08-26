class Solution {
    public int majorityElement(int[] nums) {
        // int[] ans = new int[nums.length/2];
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}