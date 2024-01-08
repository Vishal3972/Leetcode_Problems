class Solution {
     public int maximumSetSize(int[] nums1, int[] nums2) {        
        int n=nums1.length;
        
        Set<Integer> s1=new HashSet();
        Set<Integer> s2=new HashSet();
        
        for(int i:nums1)    s1.add(i);
        for(int i:nums2)    s2.add(i);

        Set<Integer> common=new HashSet(s1);
        common.removeIf(a->!s2.contains(a));

        int n1=s1.size(), n2=s2.size(), c=common.size();

        return Math.min(n, Math.min(n/2, n1-c) + Math.min(n/2, n2-c) + c);
    }
}