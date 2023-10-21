class Solution {
    public String removeTrailingZeros(String num) {
        StringBuffer s=new StringBuffer(num);
        s=s.reverse();
        int i=0;
        while(s.charAt(i)=='0'){
            i++;
        }
        String ans = s.substring(i,num.length());
        s=new StringBuffer(ans);
        return s.reverse().toString();
    }
}