class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
//         int sum = nums[0] + nums[1] + nums[2];;
//         for(int i=0; i<nums.length-2; i++){
//             for(int j=i+1; j<nums.length-1; j++){
//                 for(int k=j+1; k<nums.length; k++){
//                     int temp = nums[i] + nums[j] + nums[k];
//                     if (Math.abs(temp - target) < Math.abs(sum - target)) {
//                         sum = temp;
//                     }
//                 }
//             }
//         }
//         return sum;
        
        //  BETTER APPROACH
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}