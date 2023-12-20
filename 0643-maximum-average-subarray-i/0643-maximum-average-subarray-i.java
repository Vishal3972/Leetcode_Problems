class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        
        double maxAvg=sum/k;
        
        // sliding window
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];
            double avg=sum/k;
            maxAvg=Math.max(maxAvg,avg);
        }
        return maxAvg;
    }
}