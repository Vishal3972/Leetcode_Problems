class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                char c = s.charAt(i);
                while(i<j && s.charAt(i+1)==c){
                    i++;
                }while(j>i && s.charAt(j-1)==c){
                    j--;
                }
            }
            if(s.charAt(i)!=s.charAt(j)){
                return j-i+1;
            }
            i++;
            j--;                        
        }
        return i==j?1:0;
    }
}          