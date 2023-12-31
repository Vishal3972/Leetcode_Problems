class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            while(j<nums.length && j<=k+i){
                if(nums[i]==nums[j]){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}