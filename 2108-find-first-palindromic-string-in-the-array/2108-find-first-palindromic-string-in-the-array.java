class Solution {
    public String firstPalindrome(String[] words) {
        // for(String word:words){  
        //     int j=0;
        //     int k=word.length()-1;
        //     while(j<=k){
        //         if(word.charAt(j)!=word.charAt(k)){
        //             break;
        //         }
        //         j++;
        //         k--;
        //     }
        //     if(j>=k){
        //         return word;
        //     }
        // }
        // return "";

        // Approach 2
        for(String word :words){
            StringBuilder sb = new StringBuilder(word).reverse();
            if(word.equals(sb.toString())){
                return word;
            }
        }
        return "";
    }
}