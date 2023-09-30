class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    list.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            int m=list.get(i).get(0);
            int n=list.get(i).get(1);
            for(int j=0; j<matrix[0].length; j++){
                matrix[m][j]=0;
            }
            for(int j=0; j<matrix.length; j++){
                matrix[j][n]=0;
            }
        }
    }
}