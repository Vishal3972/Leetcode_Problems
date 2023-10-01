class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            if(i==nums.length-1){
                j=0;
            }
            while(nums[i]>=nums[j] && i!=j){
                j++;
                if(j==nums.length){
                    j=0;
                }
            }
            if(nums[j]>nums[i]){
                ans[index++]=nums[j];
            }else{
                ans[index++]=-1;
            }
        }
        return ans;
    }
}