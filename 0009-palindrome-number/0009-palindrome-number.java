class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i = 0;
        while(i <= (s.length()/2)){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
            i++;
        }
        return true;
    }
}