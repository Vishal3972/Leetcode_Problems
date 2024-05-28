class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        
        for(int i=0;i<n;i++){
            freq[Math.min(nums[i],n)]++;
        }
        int sum = 0;
        for(int i=n;i>=0;i--){
            sum += freq[i];
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}