class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int temp[]=new int[2];
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //         temp[0]=i;
        //         temp[1]=j;
        //         break;
        //         }
        //     }
        // }
        // return temp;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(map.containsKey(n) && map.get(n)!=i){
                return new int[] {i,map.get(n)};
            }
        }
        return null;
    }
}