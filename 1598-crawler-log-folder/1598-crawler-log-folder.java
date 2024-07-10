class Solution {
    public int minOperations(String[] logs) {
        String s1 = "../";
        String s2 = "./";
        int count = 0;
        for(String s : logs){
            if(s1.equals(s)){
                if(count<1){
                    continue;
                }
                count--;
            }else if(!s2.equals(s)){
                count++;
            }
        }
        return count;
    }
}