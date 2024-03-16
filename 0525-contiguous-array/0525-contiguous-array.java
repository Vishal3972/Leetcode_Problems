class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0,count = 0;
        for(int i=0;i<nums.length;i++){
            count += (nums[i]==1?1:-1);
            if(count == 0)
    			ans = Math.max(ans, i+1); 
            if(map.containsKey(count)){
                ans = Math.max(ans,i-map.get(count));
            }else{
                map.put(count,i);
            }
        }
        return ans;
    }
}