class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int arr[] = new int[list.size()];
        int index=0;
        for(int k:list){
            arr[index++]=k;;
        }
        return arr;
    }
}