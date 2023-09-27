class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuffer sb = null;
        sb = new StringBuffer(word);
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==ch){
                String s=word.substring(0,i+1);
                sb = new StringBuffer(s);
                sb.reverse();
                sb = sb.append(word.substring(i+1,word.length()));
                break;
            }
        }
        return sb.toString();
    }
}