class Solution {

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = queries.length;
        
        int arr[] = new int[nums.length];
        int count = 0;
        // arr[0]=count;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i-1]%2==0) count++;
            else if(nums[i]%2==1 && nums[i-1]%2==1) count++;
            arr[i]=count;
        }
        
        boolean ans[] = new boolean[n];
        for(int i=0;i<n;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            
            if(arr[a]==arr[b]) ans[i]=true;
            // else ans[i]=false;
        }
        
        return ans;
    }
}