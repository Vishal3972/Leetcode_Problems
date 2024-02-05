class Solution {
    public int firstUniqChar(String s) {
        // int i = 0;
        // while(i<s.length()){
        //     int j=0;
        //     for(; j<s.length(); j++){
        //         if(i!=j && s.charAt(i)==s.charAt(j)){
        //             break;
        //         }
        //     }
        //     if(j==s.length()){
        //         return i;
        //     }
        //     i++;
        // }
        // return -1;

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()==1){
                return s.indexOf(Character.toString(e.getKey()));
            }
        }
        return -1;
    }
}