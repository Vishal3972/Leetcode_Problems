class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
        
        int min = Integer.MAX_VALUE;
        for (int i = 0, j = nums.length - 4; i < 4; i++, j++) {
            min = Math.min(min, nums[j] - nums[i]);
        }
        return min;
    }
}