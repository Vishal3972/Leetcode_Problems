class Solution {
    public int[] findErrorNums(int[] nums){
        int dup=-1,mis=-1;
        int arr[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            arr[n]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                dup = i;
            }else if(arr[i]==0){
                mis = i;
            }
        }
        return new int[]{dup, mis};
    }
}