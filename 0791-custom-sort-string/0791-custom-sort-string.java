class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        String str = "";
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            if(!map.containsKey(c)){
                continue;
            }
            int size=map.get(c);
            while(size>0){
                str+=String.valueOf(c);
                size--;
            }
            map.remove(c);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            char c=e.getKey();
            int size=e.getValue();
            while(size>0){
                str+=String.valueOf(c);
                size--;
            }
        }
        return str;
    }
}