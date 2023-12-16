class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int ch[] = new int[26];
        for(int i=0; i<s.length(); i++){
            int temp = s.charAt(i)-'a';
            ch[temp] = ch[temp]+1;
        }
        for(int i=0; i<t.length(); i++){
            int temp = t.charAt(i)-'a';
            ch[temp] = ch[temp]-1;
        }
        for(int i=0; i<ch.length; i++){
            if(ch[i] != 0){
                return false;
            }
        }
        return true;
    }
}