class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i!=n && nums[i]==nums[i-1]){
                count++;
            }else{
                if(count>=n/3){
                    list.add(nums[i-1]);
                }
                count=0;
            }
        }
        return list;
    }
}