class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int opr=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int n=e.getValue();
            if(n==1){
                return -1;
            }
            opr+=Math.ceil((double)n/3);
        }
        return opr;
    }
}