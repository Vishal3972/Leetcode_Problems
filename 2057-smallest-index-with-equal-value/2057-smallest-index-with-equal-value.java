class Solution {
    public int smallestEqual(int[] nums) {
//         int min = -1;
        
//         boolean check = false;
//         for(int i=0; i<nums.length; i++){
//             if(i%10==nums[i]){
//                 if(nums[i]<=nums[min]){
//                     min = i;
//                     check = true;
//                 }                       
//             }
//         }
//         return (check)?min:-1;
        
        
        for(int i=0; i<nums.length; i++){
            if(i%10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}