class Solution {
    public int partitionString(String s) {
        String str="";
        int count=1;
        for(int i=0;i<s.length();i++){
            String c=String.valueOf(s.charAt(i));
            if(i<s.length() && !str.contains(c)){
                str+=c;
            }else{
                count++;
                str=c;
            }
        }
        return count;
    }
}