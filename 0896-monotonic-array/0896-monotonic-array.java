class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int j=nums.length-1;
        if(nums[i]<nums[j]){
            for(; i<j; i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }
        else{
            for(; i<j; i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}