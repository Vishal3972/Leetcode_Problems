class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='1';
            }else{
                ch[i]='0';
            }
        }
        String str = String.valueOf(ch);
        int ans = Integer.parseInt(str,2);
        return ans;
    }
}