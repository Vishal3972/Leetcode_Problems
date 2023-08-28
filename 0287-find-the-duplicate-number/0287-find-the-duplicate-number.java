class Solution {
    public int findDuplicate(int[] nums) {
//         int ans = 0;
//         for(int i=0; i<nums.length; i++){
//             ans ^= nums[i];
//         }
        
//         for(int i=1; i<nums.length; i++){
//             ans ^= i;
//         }
        
//         return ans;
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}