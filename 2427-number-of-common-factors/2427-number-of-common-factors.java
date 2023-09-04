class Solution {
    public int commonFactors(int a, int b) {
        int i=1;
        int mini = Integer.min(a,b);
        int count = 0;
        while(i<=mini){
            if(a%i==0 && b%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
}