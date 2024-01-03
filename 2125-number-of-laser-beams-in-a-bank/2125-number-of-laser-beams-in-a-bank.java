class Solution {
    public int numberOfBeams(String[] bank) {
        int lazers=0;
        int prevOnes=0;
        for(int i=0;i<bank.length;i++){
            String str=bank[i];
            int ones=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1')
                    ones++;
            }
            if(ones>0 && prevOnes>0){
                lazers+=prevOnes*ones;
            }
            if(ones>0)
                prevOnes=ones;
        }
        return lazers;
    }
}