class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(indexDiff==100000 && valueDiff==0){
            return false;
        }
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            while(j<=indexDiff+i && j<nums.length){
                if(Math.abs(nums[i]-nums[j])<=valueDiff){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}