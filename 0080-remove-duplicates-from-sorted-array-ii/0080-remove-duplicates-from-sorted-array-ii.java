class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int i=0;
        while(i<nums.length){
            int count=1;
            while(i!=nums.length-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            if(count>=2){
                nums[index++]=nums[i];
                nums[index++]=nums[i];
            }else{
                nums[index++]=nums[i];
            }
            i++;
        }
        return index;
    }
}