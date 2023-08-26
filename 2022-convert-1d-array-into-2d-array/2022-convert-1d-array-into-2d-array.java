class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][] = new int[m][n];
        if(original.length != m*n){
            return new int[0][0];
        }
        int k = 0;
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                ans[i][j] = original[k++];
            }
        }
        return ans;
    }
}