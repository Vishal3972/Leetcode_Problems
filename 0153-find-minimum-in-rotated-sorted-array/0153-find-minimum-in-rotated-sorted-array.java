class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[i] <= nums[j]){
                if(nums[i] < ans){
                    ans = nums[i];
                }
                break;
            }
            
            if(nums[i] <= nums[mid]){
                if(nums[i] < ans){
                    ans = nums[i];
                }
                i = mid + 1;
            }
            else{
                if(nums[mid] < ans){
                    ans = nums[mid];
                }
                j = mid - 1;
            }
        }
        return ans;
    }
}