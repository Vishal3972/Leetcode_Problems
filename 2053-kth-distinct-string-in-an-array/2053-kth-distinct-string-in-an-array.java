class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String str:arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int count = 0;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                count++;
                if(k==count){
                    return e.getKey();
                }
            }
        }
        return "";
    }
}