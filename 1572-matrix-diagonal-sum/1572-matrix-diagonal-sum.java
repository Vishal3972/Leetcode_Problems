class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0;
        int k=mat.length-1;
        while(i<mat.length){
            sum+=mat[i][i]+mat[i][k];
            i++;
            k--;
        }
        i=mat.length;
        if(i%2!=0){
            sum-=mat[i/2][i/2];
        }
        return sum;
    }
}