class Solution {
    public int addMinimum(String word) {
        int j=0, i=0, count=0;
        String str = "abc";
        for(j=0;i<word.length();j++){
            if(j==3){
                j=0;
            }
            if(word.charAt(i) == str.charAt(j)){
                i++;
            } 
            else {
                count++;
            }
        }
        count+=3-j;
        return count;
    }
}