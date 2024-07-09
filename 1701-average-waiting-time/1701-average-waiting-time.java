class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int ct = customers[0][0];
        double wt = 0;
        for(int i=0;i<n;i++){
            if(ct<customers[i][0]){
                ct = customers[i][0]+customers[i][1];
            }else{
                ct += customers[i][1];
            }
            if(customers[i][0]<ct){
                wt += ct-customers[i][0];
            }else{
                wt += customers[i][1];
            }
        }
        return wt/n;
    }
}