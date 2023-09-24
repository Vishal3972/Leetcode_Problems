class Solution {
    public String firstPalindrome(String[] words) {
        for(String i:words){  
            int j=0;
            int k=i.length()-1;
            while(j<=k){
                if(i.charAt(j)!=i.charAt(k)){
                    break;
                }
                j++;
                k--;
            }
            if(j>=k){
                return i;
            }
        }
        return "";
    }
}