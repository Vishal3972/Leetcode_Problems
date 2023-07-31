class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i] == target){
                int j = i;
                while(j < nums.length && nums[j] == target){
                    j++;
                }
                ans[0] = i;
                ans[1] = j-1;
                return ans;
            }
        }
        if(i == nums.length){
            ans[0] = -1;
            ans[1] = -1;
        }
        return ans;
    }
}