class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        for(int i=0; i<nums.length; i++){
            eSum += nums[i];
        }
        int dSum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 10){
                dSum = dSum + nums[i];
            }
            else{
                int temp = nums[i];
                while(temp > 9){ 
                    int mod = temp % 10;
                    dSum = dSum + mod;
                    temp = temp / 10;
                }
                dSum = dSum + temp;
            }
        }
        return eSum-dSum;
    }
}