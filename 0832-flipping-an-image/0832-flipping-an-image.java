class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int i=0;
        while(i<image.length){
            int j=0;
            int k=image[0].length-1;
            while(j<k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
            i++;
        }
        i=0;
        for(; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }else{
                    image[i][j]=1;
                }
            }
        }
        return image;
    }
}