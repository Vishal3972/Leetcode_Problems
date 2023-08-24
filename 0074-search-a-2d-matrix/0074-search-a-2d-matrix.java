class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<=n; j++){
                if(matrix[i][0] <= target && target <= matrix[i][n]){
                    if(matrix[i][j]==target){
                        return true;
                    }
                }else{
                    break;
                }
            }
        }
        return false;
    }
}