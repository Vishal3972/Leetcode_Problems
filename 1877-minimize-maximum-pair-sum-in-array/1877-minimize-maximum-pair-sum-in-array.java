class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxi=Integer.MIN_VALUE;
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            maxi=Math.max(sum,maxi);
            i++;
            j--;
        }
        return maxi;
    }
}