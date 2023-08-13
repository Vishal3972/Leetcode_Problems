class Solution {
    public int maximum69Number (int num) {
        // String s = Integer.toString(num);
        // if(!s.contains("6")){
        //     return num;
        // }
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<s.length(); i++){
        //     char ch[] = s.toCharArray();
        //     if(s.charAt(i)=='6'){
        //         ch[i]='9';
        //     }else{
        //         ch[i]='6';
        //     }
        //     int n = Integer.parseInt(String.valueOf(ch));
        //     if(max < n){
        //         max = n;
        //     }
        // }
        // return max;
        
        String s = Integer.toString(num);
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            
            if(s.charAt(i)=='6'){
                ch[i]='9';
                return Integer.parseInt(String.valueOf(ch));
            }
        }
        return num;
    }
}