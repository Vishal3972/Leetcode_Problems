class Solution {
    public int maximumGap(int[] nums) {
      
        Arrays.sort(nums);
        int dif=0;
        for(int i=0;i<nums.length-1;i++){
            int sub=Math.abs(nums[i]-nums[i+1]);
            if(sub>dif){
                dif=sub;
            }
        }
        return dif;
    }
}