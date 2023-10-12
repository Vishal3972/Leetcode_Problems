class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0, j = 1;
        int res[] = new int[nums.length];

        for(int num : nums){
            if(num < 0){
                res[j] = num;
                j += 2;
            }else{
                res[i] = num;
                i += 2;
            }
        }
        return res;
    }
}