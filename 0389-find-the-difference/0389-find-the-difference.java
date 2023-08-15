class Solution {
    public char findTheDifference(String s, String t) {
       //  int arr[] = new int[256];
       //  for(int i=0;i<s.length();i++){
       //      int temp = s.charAt(i);
       //      arr[temp]++;
       //  }
       //  for(int i=0;i<t.length();i++){
       //      int temp = t.charAt(i);
       //      arr[temp]--;
       //  }
       //  char ch = '\0';
       //  for(int i=0;i<arr.length;i++){
       //      if(arr[i]!=0){
       //          ch = (char)i;
       //          break;
       //      }
       //  }
       // return ch;
        
        
        
        char ans = 0;
        for(char c:s.toCharArray()){
            ans ^= c;
        }
        for(char c:t.toCharArray()){
            ans ^= c;
        }
        return ans;
    }
}