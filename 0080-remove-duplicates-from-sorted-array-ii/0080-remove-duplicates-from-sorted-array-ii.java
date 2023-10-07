class Solution {
    public int removeDuplicates(int[] nums) {
        int ans[] = new int[nums.length];
        int index=0;
        int i=0;
        
        while(i<nums.length){
            int count=1;
            while(i!=nums.length-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            if(count>=2){
                ans[index++]=nums[i];
                ans[index++]=nums[i];
            }else{
                ans[index++]=nums[i];
            }
            i++;
        }
        for(int k=0;k<ans.length;k++){
            nums[k]=ans[k];
        }
        return index;
    }
}