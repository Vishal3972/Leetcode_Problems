class Solution {
    public int minSteps(String s, String t) {
        int steps=0;
        HashMap<Character,Integer> map = new HashMap<>(26);
        HashMap<Character,Integer> map2 = new HashMap<>(26);
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            char c=e.getKey();
            if(!map2.containsKey(c)){
                steps+=e.getValue();
            }else if(map2.containsKey(c) && map2.get(c)<e.getValue()){
                steps+=e.getValue()-map2.get(c);
            }
        }
       
        return steps;
    }
}