class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<nums[0].length;i++){
            map.put(nums[0][i],1);
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<nums[i].length;j++){
                if(map.containsKey(nums[i][j])){
                    map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==n){
                list.add(e.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}