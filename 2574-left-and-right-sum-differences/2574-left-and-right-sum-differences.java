class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] output = new int[nums.length];
        int leftSum;
        int rightSum;
        for(int i=0;i<nums.length;i++){
            leftSum = 0;
            rightSum = 0;
            int j = 0;
            while(j < i){
                leftSum += nums[j];
                j++;
            }
            j = i+1;
            while(j < nums.length){
                rightSum += nums[j];
                j++;
            }
            output[i] = Math.abs(leftSum-rightSum);
        }
        return output;
    }
}