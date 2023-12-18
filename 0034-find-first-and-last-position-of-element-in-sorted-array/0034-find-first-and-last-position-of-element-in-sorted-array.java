class Solution {
    // public int[] searchRange(int[] nums, int target) {
    //     int ans[] = new int[2];
    //     int i;
    //     for(i=0; i<nums.length; i++){
    //         if(nums[i] == target){
    //             int j = i;
    //             while(j < nums.length && nums[j] == target){
    //                 j++;
    //             }
    //             ans[0] = i;
    //             ans[1] = j-1;
    //             return ans;
    //         }
    //     }
    //     if(i == nums.length){
    //         ans[0] = -1;
    //         ans[1] = -1;
    //     }
    //     return ans;
    // }
    
    public int[] searchRange(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            if(nums[s]==target && nums[e]==target){
                return new int[]{s,e};
            }
            if(nums[s]<target){
                s++;
            }
            if(nums[e]>target){
                e--;
            }            
        }              
        return new int[]{-1,-1};
    }
}