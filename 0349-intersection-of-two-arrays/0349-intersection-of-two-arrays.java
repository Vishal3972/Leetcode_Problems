class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=Math.min(nums1.length,nums2.length);
        Set<Integer> list = new HashSet<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;j++;
            }
        }
        int ans[]=new int[list.size()];
        int index=0;
        for(int k:list){
            ans[index++]=k;
        }
        return ans;
    }
}