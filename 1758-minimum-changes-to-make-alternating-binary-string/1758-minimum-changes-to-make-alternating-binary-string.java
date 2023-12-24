class Solution {
    public int minOperations(String s) {
        boolean b=false;
        int opr=0;
        for(char c:s.toCharArray()){
            if(b){
                if(c=='0'){
                    opr++;
                }
                b=false;
            }else{
                if(c=='1'){
                    opr++;
                }
                b=true;
            }
        }
        return Math.min(opr,s.length()-opr);
    }
}