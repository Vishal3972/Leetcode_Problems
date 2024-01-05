class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuffer str=new StringBuffer();
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(c>='a' && c<='z'){
                str.append(Character.valueOf((char)c));
            }else if(c>='0' && c<='9'){
                str.append(Character.valueOf((char)c));
            }
        }
        System.out.println(str);
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}