class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i=s.length()-1;
        int count=0;
        if(s.charAt(n-1) == ' '){
            while(s.charAt(i)==' '){
                count++;
                i--;
            }
        }
        while(i>=0){
            if(s.charAt(i)==' '){
                return n-i-1-count;
            }
            i--;
        }
        return s.length()-count;
    }
}