class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0;
        int j=0;
        int k=mat.length-1;
        while(i<mat.length && j<mat.length){
            sum+=mat[i][j]+mat[i][k];
            i++;
            j++;
            k--;
        }
        j=mat.length;
        if(j%2!=0){
            sum-=mat[j/2][j/2];
        }
        return sum;
    }
}