class Solution {
     public int findKOr(int[] nums, int k) {
        int ans = 0;
        for(int i=31;i>=0;i--) {
            ans = 2*ans + findBit(nums, k, i);
        }
        return ans;
    }

    private int findBit(int[] nums, int k, int index) {
        int count = 0;
        for(int num: nums) {
            if((num & (1<<index)) != 0) {
                count++;
            }
        }
        return count>=k ? 1 : 0;
    }
}