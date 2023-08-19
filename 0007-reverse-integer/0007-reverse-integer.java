class Solution {
    public int reverse(int x) {
        char[] ch = Integer.toString(x).toCharArray();
        int i=0;
        if(ch[0]=='-'){
            i++;
        }
        int j = ch.length-1;
        while(i<=j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
        String str = new String(ch);
        long n = Long.parseLong(str);  
        if(n < Integer.MIN_VALUE || n > Integer.MAX_VALUE){
            return 0;
        }
        return (int)n;
    }
}