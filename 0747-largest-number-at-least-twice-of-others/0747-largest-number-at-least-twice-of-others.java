class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                maxIndex=i;
                max=nums[i];
            }
        }
        for(int i:nums){
            if(max!=i && (i*2)>max){
                return -1;
            }
        }
        return maxIndex;
    }
}