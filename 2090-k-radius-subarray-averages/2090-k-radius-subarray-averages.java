class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0){
            return nums;
        }
        int n=nums.length;
        long sum=0;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        int l=k*2+1; 
        if(l<=n){
            for(int i=0;i<l;i++){
                sum+=nums[i];
            }
            ans[k]=(int)(sum/l);
            for(int i=k+1;i<n-k;i++){
                sum+=nums[i+k]-nums[i-k-1];
                ans[i]=(int)(sum/l);
            }
        }
        return ans;
        
        
    }
}