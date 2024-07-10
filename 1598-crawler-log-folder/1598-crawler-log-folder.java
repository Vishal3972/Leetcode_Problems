class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String s : logs){
            if(s.equals("../")){
                if(count<1){
                    continue;
                }
                count--;
            }else if(!s.equals("./")){
                count++;
            }
        }
        return count;
    }
}