class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<words.length; i++){
            sb = sb.append(words[i]);
            if(sb.length()==s.length() && sb.toString().equals(s)){
                return true;
            }else if(sb.length()>s.length()){
                break;
            }
        }
        return false;
    }
}