class Solution {
    public int numberOfMatches(int n) {
        int cnt = 0;
        while(n>1){
            if(n%2==0){
                n=n/2;
                cnt = cnt+n;
            }else{
                n=(n-1)/2;
                cnt = cnt+n+1;
            }
        }
        return cnt;
    }
}