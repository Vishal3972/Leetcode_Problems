class Solution {
    public int[] closestDivisors(int num) {
        int ans[] = new int[2];
        int n = num+2;
        int m = num+1;
        int diff = Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++){
            int x,y;
            if(m%i==0){
                x=i;
                y=m/i;
            }
            else if(n%i==0){
                x=i;
                y=n/i;
            }else{
                continue;
            }
            if((Math.abs(x-y))<diff){
                ans[0]=x;
                ans[1]=y;
                diff=Math.abs(x-y);
            }
        }
        return ans;
    }
}