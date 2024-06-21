class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        // Arrays.sort(difficulty);
        // Arrays.sort(profit);
        // Arrays.sort(worker);
        
        int pft=0;
        for(int i=0;i<worker.length;i++){
            int j=0,curPft=0;
            while(j<difficulty.length){
                if(difficulty[j]<=worker[i]){
                    curPft=Math.max(profit[j],curPft);
                }
                j++;
            }
            pft+=curPft;
        }
        return pft;
    }
}