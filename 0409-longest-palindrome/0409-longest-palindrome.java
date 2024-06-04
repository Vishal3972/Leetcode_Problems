class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        boolean b = false;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int n:map.values()){
            if(n%2==0){
                count+=n;
            }
            else if(!b && n%2==1){
                count+=n;
                b=true;
            }
            else if(n%2==1){
                count+=n-1;
            }
        }
        return count;
    }
}