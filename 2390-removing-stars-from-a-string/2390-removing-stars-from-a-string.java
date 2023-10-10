class Solution {
    public String removeStars(String s) {
        String str ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                str=str.substring(0,str.length()-1);
            }else{
                str+=s.charAt(i);
            }
        }
        return str;
    }
}