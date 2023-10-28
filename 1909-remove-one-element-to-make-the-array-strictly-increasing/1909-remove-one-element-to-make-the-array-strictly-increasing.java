class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean mark=false;
        int prev1=0,prev2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(prev1>=nums[i])
            {
                if(mark) return false;
                mark=true;
                if(prev2<nums[i]) prev1=nums[i];
            }
            else
            {
                prev2=prev1;
                prev1=nums[i];
            }
        }
        return true;
    }
}