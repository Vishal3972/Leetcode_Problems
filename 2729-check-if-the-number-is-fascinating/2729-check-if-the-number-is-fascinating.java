class Solution {
    public boolean isFascinating(int n) {
        String a = Integer.toString(n*2);
        String b = Integer.toString(n*3);
        String str = Integer.toString(n);
        str = str+a+b;
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j) || str.charAt(i)=='0'){
                    return false;
                }
            }
        }
        return true;
    }
}