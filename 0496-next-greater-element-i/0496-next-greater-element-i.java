class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            boolean get=false;
            int j;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   break; 
                }
            }
            while(j<nums2.length){
                if(nums2[j]>nums1[i]){
                    ans[index++]=nums2[j];
                    get=true;
                    break;
                }
                j++;
            }
            if(!get){
                ans[index++]=-1;
            }
        }    
        return ans;
    }
}