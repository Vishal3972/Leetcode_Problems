class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int j=pref.length();
        for(String word : words){
            if(word.length()>=j && (word.substring(0,j)).equals(pref)){
                count++;
            }
        }
        return count;
    }
}