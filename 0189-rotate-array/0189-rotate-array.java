class Solution {
    public void rotate(int[] nums, int k) {
        // if(nums.length <= 1 || nums.length == k){
        //     return;
        // }
        // int rotation = k%nums.length;
        // int ans[] = new int[nums.length];
        // int n = 0;
        // for(int i=nums.length-rotation; i<nums.length; i++){
        //     ans[n++] = nums[i];
        // }
        // for(int i=0; i<nums.length-rotation; i++){
        //     ans[n++] = nums[i];
        // }
        // n = 0;
        // for(int i:ans){
        //     nums[n++] = i;
        // }
        
        // BETTERED SPACE COMPLEXITY
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    
    public void reverse(int arr[], int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}